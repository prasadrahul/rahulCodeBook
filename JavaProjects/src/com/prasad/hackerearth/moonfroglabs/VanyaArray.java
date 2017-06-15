package com.prasad.hackerearth.moonfroglabs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 Vanya and Array

 Let's define 2 functions a function F(i) and Val(i,j) for an Array A of size N as follows:
 F(i)= ∑j=i+1 ->N Val(i,j)
 Val(i,j)= 1 ,if A[i]<A[j], else,
 Val(i,j)= 0 .
 Now, Vanya has been given one such array A of size N and an integer K.
 She needs to find the number of Distinct Unordered Pairs of elements
 (a,b) in array A such that F(a)+F(b)≥K.

 Input Format:
 The first line contains: 2 space separated integers N and K denoting the size of array A and
 the integer k from the description given above. The next line contains
 N space separated integers denoting the elements of array A .

 Output Format:
 You need to print the required answer on a single line.

 Constraints:
Subtask 1: (Worth 40% of the total points):
    1≤N≤5000
    1≤A[i]≤10^5
    0≤K≤10^4

Subtask 2: (Worth 60% of the total points) :
 1≤N≤10^6
 1≤A[i]≤10^9
 0≤K≤10^9

 Sample Input(Plaintext Link)
 8 10
 1 3 2 4 5 6 8 7

 Sample Output(Plaintext Link)
 5

 Explanation
 Here the values of Function F(x) for all the elements of Array
 A from 1 to N are: [7,5,5,4,3,2,0,0] So, the following 5 unordered pairs are considered:
 (1,2)
 (1,3)
 (1,4)
 (1,5)
 (2,3)

*/

public class VanyaArray {
    public static void main(String[] args) throws Exception{

        //nSizeArray - 1st Column[0] (size of Array)
        //kInteger  -1st Column[1] (K- Integer such that F(a)+ F(b) >= K)

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\vanya_array.txt"));
        String line = br.readLine();
        String[] qData = line.split(" ");

        int nSizeArray = Integer.parseInt(qData[0]); // N
        int kInteger = Integer.parseInt(qData[1]);  // K

        String nextLine = br.readLine();
        String[] arrayData = nextLine.split(" ");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int n = 0; n < nSizeArray ; n++) {
            arrayList.add(Integer.parseInt(arrayData[n]));

        }

        ArrayList<Integer> funcList = new ArrayList<Integer>();

        for (int i = 0; i < nSizeArray ; i++) {
            funcList.add(getFunctionArray(arrayList,nSizeArray , i));
        }


        getDistinctUnorderedPairs(funcList ,nSizeArray, kInteger);

    }

    private static void getDistinctUnorderedPairs(ArrayList<Integer> funcList, int nSizeArray, int kInteger) {

        int distinctPairs = 0;
        for (int i = 0; i <nSizeArray ; i++) {
            for (int j = i+1 ; j < nSizeArray ; j++) {

                if (funcList.get(i)+funcList.get(j) >= kInteger)
                {
                    distinctPairs = distinctPairs + 1 ;
                }


            }
        }
        System.out.println(distinctPairs);
    }

    private static int getFunctionArray(ArrayList<Integer> arrayList,int nSizeArray, int i) {

        int funData = 0 ;
            for (int k = i+1 ; k < nSizeArray ; k++) {

                if( arrayList.get(i) < arrayList.get(k) )
                {
                    funData = funData + 1 ;
                }else
                {
                    funData = funData + 0;
                }
            }
        return funData;
    }


}
