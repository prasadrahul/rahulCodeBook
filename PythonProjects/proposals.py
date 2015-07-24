from pip.backwardcompat import raw_input

"""
hackerrank.coderomio.proposals

Priya is so much beautiful , everybody want to be in a relationship with her . So it 's the Valentine's day ,
many person come to propose her but she can't decide what to do . So she simply follow a rule the person which
request her most will be selected by her. So you have to find the person which request her most.

Input :
The first line contains T - number of test cases . Each of next T lines contain a string S.

Output :
For each test case you need to print maximum occurring characters with their count followed by a single space.

Constraints :
1<=T<=50
1<=|S|<=100, where |S| denotes the length of string S.

Sample Input(Plaintext Link)
 3
aabbcc
aabcde
abcdefgh

Sample Output(Plaintext Link)
abc 2
a 2
abcdefgh 1

"""

# testcase = int(raw_input())
# for i in range(0,testcase):
#     input_data = str(raw_input())
#
#     for letter_ex in input_data:     # First Example
#         print("Current Letter :",letter_ex)

with open('demo.txt', 'r') as infile:
    data = int(infile.readline().strip())
    print("TestCase : %s" % data)

    for i in range(0,data):
        input_data = str(infile.readline().strip())
        print("Input Data is :",input_data)

        for letter_ex in input_data:     # First Example
            print("Current Letter :",letter_ex)

        # print("Current Input data :",input_data)

    print("Hi, %s" % data)

print("Hello World")
