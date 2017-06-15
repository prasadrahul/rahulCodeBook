package com.prasad.hackerearth.target;

import java.io.BufferedReader;
import java.io.FileReader;

/***
 * Puchi feels lonely after shifting to a new locality ,as he does not have any friend there.
 So,his parents bought him a new number from the Integers SuperMarket ! Every child in the locality has bought a number from the same market.
 He takes the number to go play with other children in the locality. But to his surprise, there is a rule in the locality , that is, two people A and B can only be considered friends if numbers with A and B are not Coprime,i.e, they have a common factor other than 1.
 You are given the number that Puchi bought and the numbers with other children of the locality. Can you find how many friends can he have?

 Input:
 First line contains an integer A, the number that Puchi has.
 Second line contains N, the count of children in the locality.
 Third line contains N space-separated integers, where Xi is the integer with the i th child.

 Output:
 Output the maximum number of friends that Puchi can make.

 Constraints:
 1 ≤ A ≤ 103
 1 ≤ N ≤ 103
 1 ≤ Xi ≤ 103
 *
 */

class MyFriend {
    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\myfriend.txt"));

        boolean isCoprime ;
        int myFriend = 0;
        String pNumber = br.readLine();
        int aNumber = Integer.parseInt(pNumber);

        String nChildren = br.readLine();
        int aChildren = Integer.parseInt(nChildren);

        String childrenNumbers = br.readLine();

        for (int i = 0; i < aChildren; i++) {

            String[] details = childrenNumbers.split(" ");
            String number = details[i].toString();
            int cNumber = Integer.parseInt(number);

            isCoprime = IsCoprime(aNumber, cNumber);

            if (isCoprime == false)
            {
                myFriend = myFriend + 1 ;
            }

        }


        System.out.println("Hello World! :" + myFriend);
    }


    static boolean IsCoprime(int value1, int value2) {
        return CheckCoprime(value1, value2) == 1;
    }

    static int CheckCoprime(int value1, int value2) {

        System.out.println("FirstHello  :" + value2);
        System.out.println("FirstGMrng :" + value1);

        while (value1 != 0 && value2 != 0) {
            if (value1 > value2)
                value1 %= value2;
            else
                value2 %= value1;
        }

        System.out.println("Hello  :" + value2);
        System.out.println("GMrng :" + value1);
        return Math.max(value1, value2);
    }

}