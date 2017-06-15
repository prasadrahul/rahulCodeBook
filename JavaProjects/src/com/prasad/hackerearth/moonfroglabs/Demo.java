package com.prasad.hackerearth.moonfroglabs;

/**
 * Created by rahul on 09/18/2016.
 */
public class Demo {
    public static void main(String[] args) {
        long num1 = 12345678 ;
        long range = 12413223 ;

        long sum = 0;
        for (long i = 0; i < range ; i++) {

            sum =  sum + num1 + num1++ ;
        }

        System.out.println(sum);
    }
}
