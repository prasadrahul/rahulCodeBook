package com.prasad.hackerearth.sepclash16;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 Magic Board
 Max. Marks: 100
 Kevin has a magic board filled with integers Aij. Board has N rows and
 M columns. Kevin wants that neighboring cells has as much similar values as possible (see more explanation in Scoring section).
 Two cells are called neighboring if they share same side.

 As the board is magic Kevin can change value of one cell at most K times. Help Kevin which values he has to change.

 Input format:

 The first line of the input contains three integers
 N, M and K. Each of the next N lines contains M integers Aij.

 Output format:

 The first line of the output should contain one integer X - the number of changes Kevin has to do. Each of the next
 X line should contain three integers
 ri, ci and vali. This means that new values of the cell ( ri, ci) equals vali.

 All this values have to satisfy following constraints:
 0≤X≤K
 1≤ri≤N
 1≤ci≤M
 0≤vali≤10^9

 Constraints:

 100≤N,M≤1000
 0≤K≤10^6
 0≤Ai≤10^9

 Scoring:

 If the format of your output file is incorrect, you will receive 0 points.
 Otherwise, your score is calculated in the following steps:

 Let diff be the array of absolute values of differences between all neighboring values. Size of this array equals
 N⋅(M−1)+M⋅(N−1).
 Sort diff such that diff1 is the biggest among all and
 diffsize(diff) is the smallest.

 Score equals
 (max(A)−min(A)∑i=1size(diff)diffii)2⋅106.
  max(A) - maximum in whole matrix
 A (without changes),min(A) - minimum in A.

 */

public class MagicBoard {

    //nQuery - 1st Column[0]
    //nInteger - 1st Column[1]
    //n

    public static void main(String[] args) throws Exception{

        //      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\magic_board.txt"));
        String line = br.readLine();
        int nQuery = Integer.parseInt(line);

    }
}


/**
 *
 #include <stdio.h>
 #include <string.h>

 // A utility function to find factorial of n
 int fact(int n)
 {
 return (n <= 1)? 1 :n * fact(n-1);
 }

 // A utility function to count smaller characters on right
 // of arr[low]
 int findSmallerInRight(char* str, int low, int high)
 {
 int countRight = 0, i;

 for (i = low+1; i <= high; ++i)
 if (str[i] < str[low])
 ++countRight;

 return countRight;
 }

 // A function to find rank of a string in all permutations
 // of characters
 int findRank (char* str)
 {
 int len = strlen(str);
 int mul = fact(len);
 int rank = 1;
 int countRight;

 int i;
 for (i = 0; i < len; ++i)
 {
 mul /= len - i;

 // count number of chars smaller than str[i]
 // fron str[i+1] to str[len-1]
 countRight = findSmallerInRight(str, i, len-1);

 rank += countRight * mul ;
 }

 return rank;
 }

 // Driver program to test above function
 int main()
 {
 char str[] = "string";
 printf ("%d", findRank(str));
 return 0;
 }

 */