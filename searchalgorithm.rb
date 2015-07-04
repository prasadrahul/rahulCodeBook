#!/usr/bin/ruby -w

file = File.open("input.txt", 'r')

# hash for page and query details
pageHash={}
queryHash={}

# method for storing details from file to given hash of page and query 
def storeDetail(hashPage , hashQuery ,file)

indexP=1
indexQ=1

	while !file.eof?
      
		line = file.readline

		if (line[0]=="P")
			keyPage = "#{line[0]}#{indexP}"
			valuePage = readLine(line)
			indexP+=1
	  
			hashPage [keyPage] = valuePage
		end

		if (line[0]=="Q")
			keyQuery = "#{line[0]}#{indexQ}"
			valueQuery = readLine(line)
			indexQ+=1
	  
			hashQuery [keyQuery] = valueQuery
		end	
	
	end

end

#method to read Line and make key an there respective index hash
def readLine(line)

    max_Index = 8
    value=Hash.new{|k,v|}

    #removing first word from the line  
    mline=line.split(" ")[1..-1].join(" ")
      mline.split(" ").each do |word|
		
			k = word
			v = max_Index
            
			value [k] = v	    
		    max_Index-=1

	end

	return value

end

#invoking storeDetail method by supplying two hash and input file reference
storeDetail(pageHash , queryHash ,file)

#Storing Hash key List
queryKeysList = queryHash.keys
pageKeysList = pageHash.keys


#Comparing keywords of page and query stored in hash

#outer Query Hash 
@Qkey=0
for @Qkey in 0...queryKeysList.length

	resultMap = {}
	
	queryValueHash = queryHash.values
	
	qVKeys = queryValueHash[@Qkey].keys
	qValue = queryValueHash[@Qkey].values

	#Outer Page Hash
		@Pkey=0
	for @Pkey in 0...pageKeysList.length
	
		pageValueHash = pageHash.values
	
		pVKeys = pageValueHash[@Pkey].keys
		pValue = pageValueHash[@Pkey].values
		
		#Inner Query key hash
		indexStrength = 0
		@QGkey=0
		for @QGkey in 0...qVKeys.length
			
			#Inner Page Key Hash
			@PGkey=0
			for @PGkey in 0...pVKeys.length
			
				# Algorithm for Query Strength for Page
				localmulValue = 0
				
				if (qVKeys[@QGkey] ==pVKeys[@PGkey])
				
					@Qvalues = qValue[@QGkey]
					@Pvalues = pValue[@PGkey]
				
					localmulValue = @Qvalues * @Pvalues;
				
					indexStrength += localmulValue
				
					#update index for at least one page. (for multiple keys)				
					webPageKey = pageKeysList[@Pkey]
				
					resultMap[webPageKey] = indexStrength
				
				end
		
			end
			# Internal page loop end
		end
		# Internal query loop end
	
	end
	#Outer page loop end
	
	# Sorting Result Hash by Value an arrange in descending hash 
	finalHash = Hash[resultMap.sort_by {|k,v| v}.reverse]
		
	# Printing Sorted Page Results for respective Query 	
	print " #{queryKeysList[@Qkey]}: "
		
	@Jkey=0
	for @Jkey in 0...finalHash.length
	
	
	   print finalHash.keys[@Jkey]
	   print " "
	
	end
	
	puts " "
	
end
#Outer Query loop end
