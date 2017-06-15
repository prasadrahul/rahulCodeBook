package com.prasad.hackerearth.nsetech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Data transfer !
 Monk works in a company that is into distributed systems and parallel computing. His daily work involves a large number of computers, and now he has the following task at hand :

 Given a room consisting of
 N
 N high performance systems, Monk has been told to transfer information between any
 2
 2 systems, lets call them
 i
 i and
 j
 j. where
 i
 <
 j
 i<j. Now, as per the rules of company, to transfer information from system
 i
 i to
 j
 j, one needs to transfer the data sequentially via all systems
 k
 k, such that
 i
 ≤
 k
 ≤
 j
 i≤k≤j. In short, if one needs to transfer the data from machine
 1
 1 to
 4
 4, the path for the data shall be
 1
 −
 >
 2
 −
 >
 3
 −
 >
 4
 1−>2−>3−>4 .

 Now, Each machine in this room is in one of two possible states, i.e. locked or unlocked. If a machine is in the unlocked state, data can be transferred via this machine, and the same cannot be done for a locked machine. So, in order to for Monk to transfer data between any
 2
 2 machines
 i
 i and
 j
 j, such that
 i
 <
 j
 i<j , all machines
 k
 k, such that
 i
 ≤
 k
 ≤
 j
 i≤k≤j must be unlocked.

 Now, Considering Monk's boss randomly picks a pair of machines
 i
 i and
 j
 j, such that
 i
 <
 j
 i<j among all such possible pairs, and the probability of each pair being picked remains the same, Monk wants to know the probability that he shall successfully be able to transfer the data, Can you help him out ?

 Input Format :

 The first line contains a single integer
 N
 N denoting the number of systems the room consists of. The next line consists of
 N
 N space separated integers, where the
 i
 t
 h
 ith integer denotes the state of the
 i
 t
 h
 ith machine. This integer is
 0
 0 if the machine is unlocked, otherwise its
 1
 1.

 Output Format :

 Print
 2
 2 space separated integers, denoting the numerator and denominator of the required fraction respectively. The numerator and denominator should be co-prime.

 Constraints :

 1
 ≤
 N
 ≤
 10
 6
 1≤N≤106

 0
 ≤
 A
 [
 i
 ]
 ≤
 1
 0≤A[i]≤1

 Sample Input(Plaintext Link)
 5
 1 0 0 0 1
 Sample Output(Plaintext Link)
 3 10
 Explanation
 Here, it is possible to transfer data between systems
 (
 2
 ,
 3
 )
 (2,3),
 (
 3
 ,
 4
 )
 (3,4) and
 (
 2
 ,
 4
 )
 (2,4) out of all possible pairs where
 i
 <
 j
 i<j. So the answer is
 3
 /
 10
 3/10.
 */

public class Data_Transfer {

    public static void main(String[] args) throws Exception {

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\data_transfer.txt"));
        String line = br.readLine();
        int numberOfSystem = Integer.parseInt(line);

        String nextLine = br.readLine();
        String[] nSystemStatus = nextLine.split(" ");

        ArrayList<Integer> aIndexList = new ArrayList<Integer>();
        for (int i = 0; i < numberOfSystem; i++) {
            aIndexList.add(Integer.parseInt(nSystemStatus[i]));
        }

        getProbabilityOfDataTransfer(aIndexList,numberOfSystem);
    }

    private static void getProbabilityOfDataTransfer(ArrayList<Integer> aIndexList, int numberOfSystem) {

        int numeratorCount = 0 ;
        int denominatorCount = 0 ;

        ArrayList<Integer> subArray = new ArrayList<Integer>();

        for (int i = 1; i <= numberOfSystem; i++) {
            for (int j = i+1 ; j <= numberOfSystem; j++) {

                denominatorCount = denominatorCount + 1;

                int subArraySum = 0;
                for (int k = i; k < j; k++) {
                    subArray.add(aIndexList.get(k));
                }

                for (int n = 0; n < subArray.size(); n++) {
                    subArraySum = subArraySum + subArray.get(n) ;
                }

                if(subArraySum == 0)
                {
                    numeratorCount = numeratorCount + 1 ;
                }

            }
        }

        System.out.printf(numeratorCount + " " +denominatorCount );
    }

}
