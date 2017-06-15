package com.prasad.hackerearth.lenskartsdet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * There is a major shootout going on in London. Gunmen can be encountered in most of the streets and only a few of them are safe. Sherlock is given the responsibility to ensure the safety of the people by asking them to shift to the nearest safe street.
 There are
 N
 N streets on the road. The
 i
 t
 h
 ith street is denoted by the number
 A
 [
 i
 ]
 A[i]. Gunmen do not enter streets that are denoted by a prime number i.e.
 i
 t
 h
 ith street is safe, if
 A
 [
 i
 ]
 A[i] is a prime.

 Help Sherlock find the nearest safe street for people trapped in all the
 N
 N streets i.e. print
 N
 N integers, where the
 i
 t
 h
 ith integer is the index (1-based) of the nearest safe street. The distance between cities
 i
 i and
 j
 j is given by
 |
 i
 −
 j
 |
 |i−j|. For any city
 j
 j, if there exists no safe city
 i
 i, such that people of city
 j
 j can move to city
 i
 i, print
 −
 1
 −1 for it.

 Note :

 -If there are multiple nearest safe streets, print the one with the lower index.

 Input:

 The first line contains a single integer
 N
 N denoting the number of cities. The next line contains
 N
 N integers, where the
 i
 t
 h
 ith integer denotes
 A
 [
 i
 ]
 A[i] .

 Output:
 Print the answer on a single line.

 Constraints:

 1
 ≤
 N
 ≤
 5
 ×
 10
 5
 1≤N≤5×105

 1
 ≤
 A
 [
 i
 ]
 ≤
 10
 6
 1≤A[i]≤106


 Sample Input(Plaintext Link)
 5
 1 2 3 1 6
 Sample Output(Plaintext Link)
 2 2 3 3 3
 */

public class Shootout_In_London {
    public static void main(String[] args) throws Exception {

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\shootout_in_london.txt"));
        String line = br.readLine();
        int numberOfCities = Integer.parseInt(line);

        String nextLine = br.readLine();
        String[] nCitiesData = nextLine.split(" ");

        ArrayList<Integer> aIndexList = new ArrayList<Integer>();
        for (int i = 0; i < numberOfCities; i++) {
            aIndexList.add(Integer.parseInt(nCitiesData[i]));
        }

        getLowerIndexNearestSafeStreets(aIndexList,numberOfCities);

    }

    private static void getLowerIndexNearestSafeStreets(ArrayList<Integer> aIndexList, int numberOfCities) {

        int previousIndex = 0;
        int nextIndex = 0;

        for (int i = 0; i < numberOfCities ; i++) {
            int number = aIndexList.get(i);
            int index = i;

            if (isPrimeSafe(number)) {
                System.out.println(number);
            } else {
                previousIndex = checkPreviousPrime(aIndexList, index);
                nextIndex = checkNextPrime(aIndexList, index);

                if (previousIndex == -1 && nextIndex == -1) {
                    System.out.println(-1);
                } else {
                    if (previousIndex > nextIndex) {
                        System.out.println(aIndexList.get(previousIndex));
                    }
                    if (previousIndex < nextIndex) {
                        System.out.println(aIndexList.get(nextIndex));
                    }
                }

        }
//                   System.out.println("ans" + previousIndex +";" + nextIndex);

        }

    }

    private static int checkPreviousPrime(ArrayList<Integer> aIndexList, int index) {
        for (int j = index ; j >= 0  ; j--)
        {
            if(isPrimeSafe(aIndexList.get(j)))
            {
//                System.out.println("Pre" + aIndexList.get(j)+"<===" + j );
//                return aIndexList.indexOf(aIndexList.get(j));
                return j;
            }
        }
        return -1;
    }

    private static int checkNextPrime(ArrayList<Integer> aIndexList, int index) {
        for (int j = index ; j < aIndexList.size() ; j++)
        {
            if(isPrimeSafe(aIndexList.get(j)))
            {
                return j;
            }
        }
        return -1;
    }

    private static boolean isPrimeSafe(int num) {
        if( num == 1)
        {
            return false;
        }
        if ( num > 2 && num%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
