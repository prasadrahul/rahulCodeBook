package com.prasad.hackerearth.thoughtworks;

import java.io.BufferedReader;
import java.io.FileReader;

public class FizzBuzz {
    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\fuzzbizz.txt"));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        String numbers = br.readLine();
        String[] details = numbers.split(" ");

        for (int j = 0; j < N; j++) {

            String number = details[j].toString();
            int num = Integer.parseInt(number);

            for (int k = 1; k <= num; k++) {

                if (k % 3 == 0 && k % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (k % 3 == 0) {
                    System.out.println("Fizz");
                } else if (k % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(k);
                }

            }

        }
    }

}

