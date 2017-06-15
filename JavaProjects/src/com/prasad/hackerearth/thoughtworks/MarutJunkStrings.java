package com.prasad.hackerearth.thoughtworks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MarutJunkStrings {

    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\JunkString.txt"));

        String line = br.readLine();
        int N = Integer.parseInt(line);


        if (N > 10 ) {
            System.out.println("Invalid Test");
        } else {

            for (int j = 0; j < N; j++) {

                String numbers = br.readLine();

                Pattern regex1 = Pattern.compile("[^A-Za-z0-9]");
                Pattern regex2 = Pattern.compile("[^A-Za-z]");
                Pattern regex3 = Pattern.compile(" ");


                Matcher matcher1 = regex1.matcher(numbers);
                Matcher matcher2 = regex2.matcher(numbers);
                Matcher matcher3 = regex3.matcher(numbers);

                boolean status1 = matcher1.find();
                boolean status2 = matcher2.find();
                boolean status3 = matcher3.find();


                if (status1 == false && status2 == false && status3 == false && numbers.length() <= 100 && numbers.length() > 1) {

                    System.out.println("1");
                } else if (status1 == false && status3 == false && numbers.length() <= 100 && numbers.length() > 1) {

                    System.out.println("0");
                } else {
                    System.out.println("Invalid Input");
                }


            }
        }

    }


}
