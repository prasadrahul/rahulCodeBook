package com.prasad.local;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Scanner;

public class lexicographically_min_max {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str = sc.nextLine();
//        System.out.println("Enter the length");
//        int count = sc.nextInt();

        List<String> list = new ArrayList<String>();
        for (int j = 1; j < str.length() ; j++) {

            for (int i = 0; i < str.length(); i = i + 1) {
                if (str.length() - i >= j) {
                    list.add(str.substring(i, j + i));
                }
            }
        }
        Collections.sort(list);
        System.out.println("Smallest subString:-" + list.get(0));
        System.out.println("Largest subString:-" + list.get(list.size() - 1));

        System.out.println(list);
    }
}