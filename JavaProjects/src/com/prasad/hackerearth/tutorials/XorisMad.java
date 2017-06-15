package com.prasad.hackerearth.tutorials;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class XorisMad {

    public static void main(String[] args) throws Exception{

//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\tutorial_xorismad.txt"));
        String line = br.readLine();
        int testCase = Integer.parseInt(line);

        for (int i = 0; i < testCase; i++) {

            String nextLine = br.readLine();
            int intNumber = Integer.parseInt(nextLine);
            System.out.println( getXorMadAnswers(i,intNumber));
        }

    }

    private static int getXorMadAnswers(int i, int intNumber) {

        int xNumber = intNumber ;
        int aNumber = 1 ;
        int count = 0;

        for (int j = aNumber; j <= xNumber; j++) {
            int sumAns = j + xNumber ;
            int xorAns = xorOperation( j , xNumber );
            if(xorAns == sumAns ) {
                count = count + 1;
            }
        }
        return count;
    }

    private static int xorOperation(int aNumber, int xNumber) {
        return aNumber^xNumber;
    }
}
