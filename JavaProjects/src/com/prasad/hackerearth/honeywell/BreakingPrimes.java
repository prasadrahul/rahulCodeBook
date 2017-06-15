package com.prasad.hackerearth.honeywell;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Breaking Primes
 Jesse Pinkman loves Maths. He loves prime numbers and wants to research on this topic. He asks his Maths professor Walter White a.k.a. Heisenberg for guidance. Heisenberg says that he will guide him if and only if he answers all his
 Q
 Q questions correctly. In all the
 Q
 Q questions, he gives three positive integers
 A
 A,
 B
 B and
 K
 K where
 A
 ≤
 B
 .
 A≤B.
 He asks Jesse to find an integer
 P
 P closest to
 A
 A such that there are at least
 K
 K prime numbers in the range
 [
 A
 ,
 P
 ]
 [A,P] where
 A
 ≤
 P
 ≤
 B
 A≤P≤B. Jesse needs your help as he is very interested to do research under Heisenberg. Find the minimum
 P
 P or report
 −
 1
 −1 if there is no such
 P
 P which meets the constraints.

 Note: A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

 Input format:

 The first line of input contains one positive integer
 Q
 Q. The following
 Q
 Q lines contains three spaced-separated integers
 A
 A,
 B
 B and
 K
 K.

 Output format:

 For each query, print the answer in a new line, if it exists, else print
 −
 1
 −1.

 Constraints:

 1
 ≤
 Q
 ≤
 100
 ,
 000
 1≤Q≤100,000
 1
 ≤
 A
 ≤
 B
 ≤
 1
 ,
 000
 ,
 000
 1≤A≤B≤1,000,000
 1
 ≤
 K
 ≤
 1
 ,
 000
 ,
 000
 1≤K≤1,000,000
 A
 ≤
 P
 ≤
 B
 A≤P≤B
 Sample Input(Plaintext Link)
 5
 2 5 1
 2 5 2
 4 12 2
 3 17 7
 5 5 1
 Sample Output(Plaintext Link)
 2
 3
 7
 -1
 5
 Explanation
 In the first query, 2 itself is a prime. So P=2.

 In the second query, 3 is the minimum integer such that [2,3] contains 2 primes.

 In the fourth query, there are only 6 prime numbers in the range [3,17].
 */

public class BreakingPrimes {
    public static void main(String args[] ) throws Exception {

        //nQuery - 1st
        //nA - 1st Column[0] (starting number)
        //nB  -  Column[1] (Ending number)
        //nK  -  Column[2] (No of Prime Required)

//              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\breaking_primes.txt"));
        String line = br.readLine();
        int nQuery = Integer.parseInt(line);

        for (int i = 0; i < nQuery ; i++) {
            String qLine = br.readLine();
            String[] qData = qLine.split(" ");

            int nStartNumber = Integer.parseInt(qData[0]);
            int nEndNumber = Integer.parseInt(qData[1]);
            int nPrimeNumberCount = Integer.parseInt(qData[2]);

            int answer = getRequiredAnswer(nStartNumber, nEndNumber, nPrimeNumberCount);
            System.out.println(answer);
        }

    }

    private static int getRequiredAnswer(int nStartNumber, int nEndNumber, int nPrimeNumberCount) {
        int count = 0;
        for (int p = nStartNumber ; p <= nEndNumber ; p++) {

            if (isPrime(p) )
            {
                count = count + 1 ;
                if (count == nPrimeNumberCount )
                {
                 return p;
                }

            }
        }
            return -1;
    }

    private static boolean isPrime(int num) {
        if ( num > 2 && num%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


}
