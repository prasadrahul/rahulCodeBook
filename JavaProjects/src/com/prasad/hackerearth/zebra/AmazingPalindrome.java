package com.prasad.hackerearth.zebra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazingPalindrome {

    public static void main(String[] args) throws Exception {

//              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\zebra_hiring.txt"));
        String str = br.readLine();

        List<String> list = new ArrayList<String>();

        //Generate main string and substring as well
        for (int j = 1; j <= str.length() ; j++) {
            for (int i = 0; i < str.length(); i = i + 1) {
                if (str.length() - i >= j) {
                    list.add(str.substring(i, j + i));
                }
            }
        }

        int count = amazingPalindromeCounts(list);
        System.out.println(count);
    }

    private static int amazingPalindromeCounts(List<String> list) {

        int aCount = 0 ;
        for (int i = 0; i < list.size(); i++) {

            String subString = list.get(i);
            String compressString = getCompressString(subString);

//            System.out.println("CompressString : " + compressString);
//            int length = compressString.length();
//            String reverse = "" ;

//            for (int j = length - 1; j >= 0; j--){
//                reverse = reverse + compressString.charAt(j);
//                if (compressString.equals(reverse))
//                    aCount++;
//                }

//                String reverse = new StringBuffer(compressString).reverse().toString();
//
//                if (reverse.equals(compressString))
//                    aCount++;

            if(isPalindrom(compressString))
                aCount++;

//            System.out.println("STR  " + compressString + ":" + isPalindrom(compressString));
        }
        return aCount;
    }

//    private static boolean isPalindrome(String str) {
//        int start = 0;
//        int end = str.length() - 1;
//        int half = end/2;
//
//        for(int i = 0; i < half; i++, start++, end-- ){
//            if(str.charAt(start) != str.charAt(end))
//                return false;
//        }
//        return true;
//    }



    private static String getCompressString(String subString) {
        int len = subString.length();
        String str = subString + " ";
        String ans = "";

        for (int i = 0; i < len; i++) {
            if(str.charAt(i) != str.charAt(i+1))
            {
                ans = ans + str.charAt(i);
            }
        }
//        System.out.println("SuBS: " + subString + " ==> "+ ans );

        return ans;
    }


    public static boolean isPalindrom(String text)
    {
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;
        }
        return false;
    }



    public static String reverse(String input){
        if(input == null || input.isEmpty())
        {
            return input;
        }
//        String a = input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
//        System.out.println("org: " + input  + " reverse  ==> " + a );
//        return a;
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }
}


