package com.prasad.hackerearth.julyclash;


import java.io.BufferedReader;
import java.io.FileReader;

public class SomethingGenuine {

    static int numberOf_OS = 0;
    static String [] licenceDetails = null ;

    public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\somethingGenuine.txt"));

        String line = br.readLine();
        numberOf_OS = Integer.parseInt(line);

        String line2 = br.readLine();

        for (int i = 0; i < numberOf_OS; i++) {

            licenceDetails = line2.split(" ");
            String licenceInfo = licenceDetails[i].toString();

            System.out.println("hello world :" + licenceInfo);
        }

        processGenuineOS(licenceDetails);

    }

    private static void processGenuineOS(String[] licenceDetails) {

        int roundNumber;

        createSubArray(licenceDetails);

        for (int i = 0; i < numberOf_OS; i++) {

//            licenceDetails = 0 ;
//            finalSum = numberOf_OS + 0;

        }

        int uNumber = findUniqueNumber(licenceDetails);

    }

    private static void createSubArray(String[] licenceDetails) {

        int length = licenceDetails.length;

    }

    static int findUniqueNumber(String[] licenceDetails) {

        for (int i = 0; i < numberOf_OS; i++) {

           System.out.println("World!");

        }
        return 1;
    }
}
