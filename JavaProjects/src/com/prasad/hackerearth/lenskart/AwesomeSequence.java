package com.prasad.hackerearth.lenskart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Given an array A consisting of K integers, today, you need to construct an awesome sequence
 S. An awesome sequence S has the following properties:

 It is infinite in length, and the
 0th element of the sequence is 1.

 After having the
 0th element of the sequence, in each following step, the entire sequence existing till now, is appended to the end of it. For example, if the sequence till now is
  (x,y), it becomes  (x,y,x,y)
 Now, assume the indices of the elements appended to the sequence in the previous step ranges from
 L to  R. So, you need to modify all elements ranging from  L to  R in sequence
 S as per the following formula :

 ∀i where
 L≤i≤R, :
 Si = Si+A[(i mod K)] , where mod represents the remainder on division of  i by  K

 Follow steps
 2 and  3 recursively until infinity.

 Now, in addition to this, you shall be given  Q queries, In each query you shall be given a single integer  M. You need to find and print for the
 ith query, the element present at index  Mi of the sequence. As the answer to each query can be rather large, print it Modulo
 109+7 .

 Input Format :

 The first line contains a single integer
 K
 K. The next line contains
 K
 K space separated integers denoting the elements of array
 A
 A. The next line contains a single integer
 Q
 Q. Each of the next
 Q
 Q lines contains a single integer
 M
 M, the parameter for the
 i
 t
 h
 ith query.

 Output Format :

 For each query, print the answer on a single line.As the answer can be rather large, print it Modulo
 109+7.

 Constraints :
 1≤K≤105
 0≤A[i]≤109
 1≤Q≤105
 0≤M≤1015

 Sample Input(Plaintext Link)
 5
 1 2 3 4 5
 5
 0
 1
 5
 10
 20
 Sample Output(Plaintext Link)
 1
 3
 4
 5
 7
 Explanation
 Firstly, the sequence consists of only element (1). Then, we append the current sequence to its end, thus, it becomes
  (1,1).

 In this last step, elements from index  1 to  1 were added to the end of the sequence.
 Thus we need to modify all these elements. As a result of this, the element at index 1 becomes 3.
 So, the sequence becomes (1,3).

 Then again, we append the current sequence to its and, and the new sequence is
 (1,3,1,3). Then again, we modify elements from index  2 to  3 and so on. As a result of this, the sequence becomes
 (1,3,4,7).

 This procedure is carried on until infinity.
 */

public class AwesomeSequence {
    public static void main(String[] args) throws Exception {

//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\vanya_array.txt"));
        String line = br.readLine();
        String[] qData = line.split(" ");

        int nSizeArray = Integer.parseInt(qData[0]); // N
        int kInteger = Integer.parseInt(qData[1]);  // K

    }
}
