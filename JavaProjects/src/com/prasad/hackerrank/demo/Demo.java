package com.prasad.hackerrank.demo;

/**
 * Created by rahul on 09/10/2016.
 */


public class Demo {

    // generic method printArray
    public static < E > void printArray( E[] inputArray )
    {
        // Display array elements
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Demo.class.getDeclaredMethods().length > 2){
            System.out.printf("You should only have 1 method named printArray.");
        }
    }

}
