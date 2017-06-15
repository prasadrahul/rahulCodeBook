package com.prasad.hackerearth.amazon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Micro_and_Mini {

    static String[] readData ;

    public static void main(String[] args)throws Exception {

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\micro_and_mini.txt"));

        String line = br.readLine();
        int nTestCase = Integer.parseInt(line);

        for (int i = 0; i < nTestCase ; i++) {
            String readData = br.readLine();
            getPriceOfString(nTestCase,readData);
        }
    }

    private static void getPriceOfString(int nTestCase, String readData) {

        int nLength = readData.length();
        List<String> ans = getAllCombinationOfString(readData ,nLength );

//        Collections.sort(ans) ;

        Set<String> hs = new HashSet<>();
        hs.addAll(ans);
        ans.clear();
        ans.addAll(hs);

        System.out.println(ans.size());

        }

    private static List<String> getAllCombinationOfString(String readData, int nLength) {

        List<String> list = new ArrayList<String>();

        String str = readData ;

        for (int i = 0; i < nLength; i++)
        {
            String ans = "" ;
            ans = ans + str.charAt(i) + str.substring(0, i) + str.substring(i + 1, nLength);
            list.add(ans);
//            System.out.println( ans);
        }

        return list;
    }

}
