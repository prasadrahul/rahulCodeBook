package com.prasad.hackerearth.bookmyshow;
/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.FileReader;


/**
 Given a string S, answer Q queries.
 Each query contains a string qstr. Please output the number of substrings of S that contain some anagram of qstr as a subsequence.

 Input Format:

 The first line of input file contains an integer T that denotes the number of test cases to follow.
 Each of the test cases contain the string S in first line. The next line contains an integer Q. Each of the next Q lines contain a query string qstr.

 Output Format:

 The output file should contain answers for each query in a new line.

 Constraints:

 1 ≤ T ≤ 3
 1 ≤ |S| ≤ 105
 1 ≤ Q ≤ 200
 None of the characters in qstr shall be repeated.
 All the strings will only contain characters from A-Z, a-z and 0-9.

 Notes:

 The substrings are considered different only if there start or end positions differ.
 Subsequence is a sequence of characters that you obtain upon deletion of 1 or more character from the string.
 Sample Explanation:

 Case #1:

 a occurs in following substrings:

 a 0..0
 ab 0..1
 aba 0..2
 ba 1..2
 a 2..2

 (the start and end points here, are inclusive)

 Case #2:

 dba occurs as its anagram abd in abcd at 0..3
 dba occurs as its anagram bda in bcda at 1..4
 dba occurs as its anagram dba in abcda at 0..4
 *
 * */

 class SubstringQueries {

        public static void main(String args[] ) throws Exception {

        //Read input from stdin and provide input before running substring-queries.txt

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\substring-queries.txt"));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }


            System.out.println("Hello World!");
        }
    }

