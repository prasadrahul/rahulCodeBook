package com.prasad.hackerearth.lenskart;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Queen Vasya is preparing for a war against Rhezo. She has N warriors in total arranged in a line.
 * Let us number the warriors by numbers from 1 to N. She will fight Rhezo's army for
 Q days, and each day she can choose only one warrior.

 For each warrior, we know 2 values associated with him, let us call these
 A and B. Each day Vasya can choose her warrior from a range
 Li to Ri, she must choose the warrior with maximum A value. If there is more than 1 warrior having the same maximum
 A value, she chooses the warrior with minimum  B value. If still there is more than
 1 warrior with same maximum A value and same minimum B value, she chooses the one with lower index in line.

 You being the hand of Queen Vasya, need to help her in choosing the warrior for each day.

 Input:

 First line contains a single integer
 N
 N, denoting the number of warriors Queen Vasya has. Second line contains
 N
 N space separated integers
 A
 i
 Ai. Third line contains
 N
 N space separated integers
 B
 i
 Bi. Next line contains a single integer
 Q
 Q, denoting the number of days Queen Vasya chooses a warrior. Each of the next
 Q
 Q lines contains
 2
 2 integers
 L
 i
 Li and
 R
 i
 Ri.

 Output:

 For each
 L
 i
 Li and
 R
 i
 Ri, print the index of the warrior that Queen Vasya should choose.

 Constraints:

 1≤N,Q≤106
 1≤Ai,Bi≤109
 1≤Li≤Ri≤N
 Sample Input(Plaintext Link)
 5
 1 8 4 6 8
 4 8 6 3 7
 4
 1 4
 2 4
 3 4
 1 5
 Sample Output(Plaintext Link)
 2
 2
 4
 5

 Explanation
 For the last query, both warrior number 2 and warrior number 5 have the same maximum
 A value, but we will choose warrior 5 because he has a lower B value.

 */

public class Vasya_Vs_Rhezo {

    public static void main(String[] args) throws Exception {

//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\vasya_vs_rhezo.txt"));
        String line = br.readLine();
        int nWarriors = Integer.parseInt(line);


        String nSecondLine = br.readLine();
        String[] aIndex = nSecondLine.split(" ");

        ArrayList<Integer> aIndexList = new ArrayList<Integer>();
        for (int i = 0; i < nWarriors; i++) {
            aIndexList.add(Integer.parseInt(aIndex[i]));

        }

        String nThirdLine = br.readLine();
        String[] bIndex = nThirdLine.split(" ");

        ArrayList<Integer> bIndexList = new ArrayList<Integer>();

        for (int j = 0; j < nWarriors; j++) {
            bIndexList.add(Integer.parseInt(bIndex[j]));
        }


        String nForthLine = br.readLine();
        long nWarDays = Integer.parseInt(nForthLine);

        for (int q = 0; q < nWarDays; q++) {

            String nextLine = br.readLine();
            String[] leftRightRange = nextLine.split(" ");

            int nLeft = Integer.parseInt(leftRightRange[0]);
            int nRight = Integer.parseInt(leftRightRange[1]);

            getWarriorIndexForQueenVasya(nWarriors, aIndexList, bIndexList, nLeft, nRight);
        }


    }

    private static void getWarriorIndexForQueenVasya(int nWarriors, ArrayList<Integer> aIndex, ArrayList<Integer> bIndex, int nLeft, int nRight) {

        int demo = nWarriors ;
        int max = checkMaxInRange(aIndex, nLeft, nRight);
        ArrayList<Integer> maxIndexList = checkMaxInRangeCount(aIndex, nLeft, nRight, max);

//        System.out.println(max +":: count" + maxIndexList );

        if(maxIndexList.size() == 1)
        {
            System.out.println( maxIndexList.get(0) + 1 );
        }

        if(maxIndexList.size() > 1)
        {
            int minB = checkMinInRange(bIndex, maxIndexList);
            ArrayList<Integer> minIndexList = getIndexOfMinValue(bIndex,nLeft, nRight,minB);

//            System.out.println(minB + "--T");
//            if(minIndexList.size() > 1)
//            {
//                System.out.println( minIndexList.get(0)+1);
//            }
            System.out.println( minIndexList.get(0)+1);
        }


}

    private static int checkMinInRange(ArrayList<Integer> bIndex, ArrayList<Integer> maxIndexList) {
        int minInRange = bIndex.get(maxIndexList.get(0)) ;

        for (int i = 1; i < maxIndexList.size(); i++) {

            if(minInRange >= bIndex.get(maxIndexList.get(i)) )
            {
                minInRange = bIndex.get(maxIndexList.get(i)) ;
            }
        }

        return minInRange;
    }

    private static ArrayList<Integer> getIndexOfMinValue(ArrayList<Integer> bIndex, int nLeft, int nRight, int minValue) {

        ArrayList<Integer> indexMinValue = new ArrayList<Integer>();
        for (int i = nLeft-1 ; i < nRight; i++) {
            if(minValue == bIndex.get(i) )
            {
                indexMinValue.add(i);
            }
        }
        return indexMinValue;
    }

    private static ArrayList<Integer> checkMaxInRangeCount(ArrayList<Integer> aIndex, int nLeft, int nRight, int maxValue) {


        ArrayList<Integer> indexMaxValue = new ArrayList<Integer>();
        for (int i = nLeft-1 ; i < nRight; i++) {
            if(maxValue == aIndex.get(i) )
            {
                indexMaxValue.add(i);
            }
        }
        return indexMaxValue;
    }

    private static int checkMaxInRange(ArrayList<Integer> aIndex, int nLeft, int nRight) {

        int maxInRange = aIndex.get(nLeft-1) ;
        for (int i = nLeft; i < nRight; i++) {

            if(maxInRange <= aIndex.get(i) )
            {
                maxInRange = aIndex.get(i) ;
            }
        }

        return maxInRange;

    }
}