package com.hackerearth.bookmyshow;

/* IMPORTANT: class must not be public. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


class Test {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long N = Integer.parseInt(line);

        for (int n = 0; n < N; n++) {

            String studentDetail = br.readLine();
            int studentCount = Integer.parseInt(studentDetail);

            String boyDetail = br.readLine();
            String girlDetail = br.readLine();

            String[] boyH = boyDetail.split(" ");
            String[] girlH = girlDetail.split(" ");

            Integer[] boy = new Integer[boyH.length];
            Integer[] girl = new Integer[girlH.length];

            for (int k = 0; k < studentCount; k++) {
                boy[k] = Integer.parseInt(boyH[k]);
                girl[k] = Integer.parseInt(girlH[k]);
            }

            Arrays.sort(boy, Collections.reverseOrder());
            Arrays.sort(girl);

            int j = 0;
            for (int i = 0; i < studentCount; i++) {
                if (girl[i] % boy[i] == 0 || boy[i] % girl[i] == 0) {
                    j++;
                }
            }
            System.out.println(j);
        }
    }
}