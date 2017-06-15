package com.prasad.hackerearth.altimetrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

/**
 * Created by rahul on 08/13/2016.
 */
public class Milly_Pens_Big {
    public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\milly_pens.txt"));
        String line = br.readLine();
        int testCase = Integer.parseInt(line);
        BigInteger[] ar = new BigInteger[10];

        //BigInteger[] ar = new BigInteger[noOfInputs];
        //       String nextLine = br.readLine();
//        ar[i]  = new BigInteger( nextLine);

        for (int i = 0; i < testCase; i++) {

            String readTestCase = br.readLine();
            String[] storeData = readTestCase.split(" ");
            
            ar[0] = new BigInteger(storeData[0]);
            ar[1] = new BigInteger(storeData[1]);
            ar[2] = new BigInteger(storeData[2]);

            System.out.println("hello world" + ar[0] + ar[1] + ar[2]);

            int verify = ar[1].add(ar[2]).compareTo(ar[0]) ;

            System.out.println("hello world" + verify);
//            if () {
                String ReadPranjulPen = br.readLine();
//                String[] pranjulPenID = ReadPranjulPen.split(" ");

                String readMillyPen = br.readLine();
//                String[] millyPenID = readMillyPen.split(" ");

//                int uniqueCount = 0;
//                for (int p = 0; p < pranjulCount; p++) {
//
//                    int panjulID = Integer.parseInt(pranjulPenID[p]);
//
//                    for (int m = 0; m < millyCount; m++) {
//                        int millyID = Integer.parseInt(millyPenID[m]);
//
//                        if (panjulID == millyID) {
//                            uniqueCount++;
//                        }
//                    }
//                }
//                if (uniqueCount > 0) {
//                    System.out.println("They can't");
//                } else {
//                    System.out.println("They can");
//                }
//
//            } else {
//                System.out.println("They can't");
//            }

            System.out.println("hello world last");
        }
    }

}
