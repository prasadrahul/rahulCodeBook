package com.prasad.hackerearth.codestellar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

/**
 * Created by rahul on 7/12/2015.
 */
public class FunWithFibonacci {


    public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\funwithfibonacci.txt"));
        String line = br.readLine();
        int noOfInputs = Integer.parseInt(line);


//        Scanner scanner = new Scanner(System.in);
//        int noOfInputs = scanner.nextInt();

        BigInteger[] ar = new BigInteger[noOfInputs];
        for (int i = 0; i < noOfInputs; i++) {
//            ar[i] = scanner.nextBigInteger();

            String nextLine = br.readLine();
            ar[i]  = new BigInteger( nextLine);
        }
        printFibonacciEvenSum(ar);

    }

    private static void printFibonacciEvenSum(BigInteger[] ar) {
        for (int i = 0; i < ar.length; i++) {
            BigInteger nextSequence = BigInteger.ZERO, first = BigInteger.ZERO, second = BigInteger.ONE, sum = BigInteger.ZERO, input = ar[i];
            while ((first.add(second)).compareTo(input) == -1) {
                nextSequence = first.add(second);
                first = second;
                second = nextSequence;
                if ((nextSequence.remainder(BigInteger.valueOf(2))).compareTo(BigInteger.ZERO) == 0) {
                    sum = sum.add(nextSequence);
                }
            }
            System.out.println(sum);
        }

    }
}


//
///* IMPORTANT: class must not be public. */
//
//import java.io.BufferedReader;
//        import java.io.InputStreamReader;
//
//class TestClass {
//    public static void main(String args[] ) throws Exception {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        int N = Integer.parseInt(line);
//
//
//        for (int i = 0; i < N; i++) {
//
//            String nextLine = br.readLine();
//            int limit = Integer.parseInt(nextLine);
//
//            int numFirst = 0;
//            int numSecond = 1;
//            int nextNumber = 0;
//            int finalSum = 0 ;
//
//            while (nextNumber <= limit )
//            {
//                nextNumber = numFirst + numSecond;
//
//                numFirst = numSecond;
//                numSecond = nextNumber ;
//
//                if ( nextNumber %2 == 0 && nextNumber <= limit ) {
//                    finalSum = finalSum + nextNumber ;
//
//                }
//
//            }
//            System.out.println( finalSum);
//
//        }
//
//    }
//}
