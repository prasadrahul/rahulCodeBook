package com.prasad.hackerearth.amazon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 *
 Constraints :
 1≤N≤10^5
 1≤q≤10^5
 1≤L≤R≤N
 S1⊆(′a′−′z′)
 S2⊆(′0′−′1′)

 Sample Input(Plaintext Link)
 4
 abcd
 1100
 2
 1 2
 3 4

 Sample Output(Plaintext Link)
 1
 1
 * Explanation
 * For the 1st query, the 1st and the 2nd families come together to host a party as they have the same sleep type.
 * Similarily, for the 2nd query, the 3rd and the 4th families come together.
 *
 */

public class Vasya_and_Work {

    static final int mod = (int) 1e9 + 7;
    static String[] readData ;

    public static void main(String[] args)throws Exception {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\vasya_and_work.txt"));

        String line = br.readLine();
        long numberOfResident = Integer.parseInt(line);

        String foodHabit = br.readLine();
        String[] foodHabitData = foodHabit.split("");

        String sleepHabit = br.readLine();
        String[] sleepHabitData = sleepHabit.split("");

//        System.out.println(foodHabitData[1] + "" +foodHabitData[2]+ "" +foodHabitData[3]+ "" +foodHabitData[4]);
//        System.out.println(sleepHabitData[0] + "" +sleepHabitData[2]+ "" +sleepHabitData[3]+ "" +sleepHabitData[4]);

        String nextLine = br.readLine();
        long nQuery = Integer.parseInt(nextLine);

        for (long i = 0; i < nQuery ; i++) {

            String nextQueryLine = br.readLine();
            readData = nextQueryLine.split(" ");
            getDetailsOfSpecialPartyHosted(numberOfResident,foodHabitData,sleepHabitData,readData);
        }

    }

    private static void getDetailsOfSpecialPartyHosted(long numberOfResident, String[] foodHabitData, String[] sleepHabitData, String[] readData) {

        int leftNode = Integer.parseInt(readData[0]);
        int righNode = Integer.parseInt(readData[1]);

        long specialCount = 0;

        if (righNode <= numberOfResident) {
            for (int i = leftNode; i <= righNode; i++) {
                for (int j = i + 1; j <= righNode; j++) {

                    //                System.out.printf("fLi " + foodHabitData[i]);
                    //                System.out.println(" fRi " + foodHabitData[j]);
                    //
                    //                System.out.printf("sLi " + sleepHabitData[i]);
                    //                System.out.println(" sRi " + sleepHabitData[j]);

                    if (foodHabitData[i].equals(foodHabitData[j]) || sleepHabitData[i].equals(sleepHabitData[j])) {
                        specialCount = specialCount + 1;
                    }

                }
            }

        }else
        {
            throw new IndexOutOfBoundsException();
        }


        specialCount = (specialCount) % mod;
        System.out.println(specialCount);

    }
}
