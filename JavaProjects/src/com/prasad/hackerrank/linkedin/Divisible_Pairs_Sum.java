package com.prasad.hackerrank.linkedin;

import java.util.Scanner;

/**
 * You are given an array of  integers, , and a positive integer, . Find and print the number of pairs where  and  +  is evenly divisible by .

 Input Format

 The first line contains  space-separated integers,  and , respectively.
 The second line contains  space-separated integers describing the respective values of .

 Constraints

 Output Format

 Print the number of  pairs where  and  +  is evenly divisible by .

 Sample Input

 6 3
 1 3 2 6 1 2
 Sample Output

 5

 */

//6 3
//1 3 2 6 1 2

public class Divisible_Pairs_Sum {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();

            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            printDivisiblePair(a, n, k);


        }

    private static void printDivisiblePair(int[] a, int n, int k) {

        int count = 0 ;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {

                int sum = a[i]+a[j] ;
                if( sum % k == 0 && i < j)
                {
                    count = count + 1;
                }
            }
        }

        System.out.println(count);
    }
}

