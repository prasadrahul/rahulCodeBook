package com.hackerearth.target;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;


/***
 * Marut loves to play with numbers. So, he keeps on asking questions to his big brother Pushkar. Today, he is playing with an array of numbers, A, of size N. Marut asks many queries to Pushkar.

 In each query, Pushkar has to tell the minimum number of elements to be added in the array A such that Kth smallest number in A becomes the Xth smallest number in A.

 Only positive non-zero numbers can be added to A. Your task is to help Pushkar in answering Q queries of Marut.

 Note: A number p in A is said to be the Kth smallest number of A if after sorting A in non decreasing order, p is present at Kth position of A. For example, if an array has 5 elements: 2, 4, 45, 20, 13 respectively - then the 3rd smallest element would be: 13.

 Input:
 The first line contains an integer N, denoting the size of the array A.
 The second line contains N integers separated by a single space.
 The third line contains an integer Q, denoting the number of queries.
 Next Q lines contain two integers K and X, separated by a single space.

 Output:
 Print the answers for the Q queries, each in a new line.

 Constraints:
 1 ≤ Size of the array ≤ 4x106
 1 ≤ Elements of the Array, Ai ≤ 105
 1 ≤ Number of queries ≤ 105
 1 ≤ Value of K ≤ Value of X ≤ N

 Subtask 1: (25 points)
 1 ≤ N ≤ 103
 1 ≤ Ai ≤ 103
 1 ≤ Number of queries ≤ 103
 1 ≤ Value of K ≤ Value of X ≤ N

 Subtask 2: (75 points)
 Original constraints
 *
 */
class MarutQueries {
    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\marutQueries.txt"));

        String line1 = br.readLine();
        int arraySize = Integer.parseInt(line1);


        String line2 = br.readLine();

        for (int i = 0; i < arraySize; i++) {

           String [] details = line2.split(" ");
            String number = details[i].toString();
            int N = Integer.parseInt(number);

            System.out.println( N );
        }


        String line3 = br.readLine();
        int no_Queries = Integer.parseInt(line3);


        String line4 = br.readLine();
        for (int i = 0; i < arraySize; i++) {

            String [] details = line4.split(" ");
            String number = details[i].toString();
            int N = Integer.parseInt(number);

            System.out.println( N );
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("hello world");
        }

        System.out.println("Hello World!");
    }
}


