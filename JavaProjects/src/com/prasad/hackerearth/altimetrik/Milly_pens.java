package com.prasad.hackerearth.altimetrik;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by rahul on 08/13/2016.
 *  IMPORTANT: Multiple classes and nested static classes are supported
 * uncomment this if you want to read input.
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
*/

public class Milly_pens {

    public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\milly_pens.txt"));
        String line = br.readLine();
        int testCase = Integer.parseInt(line);

        for (int i = 0; i < testCase; i++) {

            String readTestCase = br.readLine();
            String[] storeData = readTestCase.split(" ");
            int uniquePenCount = Integer.parseInt(storeData[0]);
            int pranjulCount = Integer.parseInt(storeData[1]);
            int millyCount = Integer.parseInt(storeData[2]);
//            System.out.println("hello world" + uniquePenCount + pranjulCount + millyCount);

//            if (uniquePenCount <= pranjulCount + millyCount) {
                String ReadPranjulPen = br.readLine();
                String[] pranjulPenID = ReadPranjulPen.split(" ");

                String readMillyPen = br.readLine();
                String[] millyPenID = readMillyPen.split(" ");

                int uniqueCount = 0;
                for (int p = 0; p < pranjulCount; p++) {

                    int panjulID = Integer.parseInt(pranjulPenID[p]);

                    for (int m = 0; m < millyCount; m++) {
                        int millyID = Integer.parseInt(millyPenID[m]);

                        if (panjulID == millyID) {
                            uniqueCount++;
                        }
                    }
                }
                if (uniqueCount > 0) {
                    System.out.println("They can't");
                } else {
                    System.out.println("They can");
                }
//
//            } else {
//                System.out.println("They can't");
//            }

//            System.out.println("hello world last");
        }
    }
}


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

