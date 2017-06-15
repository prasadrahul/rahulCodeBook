package com.prasad.hackerearth.thoughtworks;

/* IMPORTANT: class must not be public. */


import java.io.BufferedReader;
import java.io.FileReader;

class SumTwoNumbers {
       public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // sumtwoNumbers.txt
        BufferedReader br = new BufferedReader(new FileReader("resource\\sumtwoNumbers.txt"));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {

            String numbers = br.readLine();

            String [] details = numbers.split(" ");
            String number1 = details[0].toString();
            String number2 = details[1].toString();


            int N1 = Integer.parseInt(number1);
            int N2 = Integer.parseInt(number2);

            System.out.println( N1+N2 );
//            System.out.println("hello world : " + N2 );
        }

        }
    }

