package com.prasad.hackerearth.octeasy16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] readData = line.split(" ");

        long nFansNumber = Integer.parseInt(readData[0]);
        long nPossibleMeet = Integer.parseInt(readData[1]);

        HashMap<String, Integer> fanDetail = new HashMap<String, Integer>();

        for (long i = 0; i < nFansNumber; i++) {
            String nextLine = br.readLine();
            String[] readFanDetail = nextLine.split(" ");

            fanDetail.put(readFanDetail[0], Integer.parseInt(readFanDetail[1]));
        }

        getTheBestPlayer(fanDetail, nFansNumber, nPossibleMeet);
    }

    private static void getTheBestPlayer(HashMap fanDetail, long nFansNumber, long nPossibleMeet) {

        Map<String, Integer> treeMap = new TreeMap<String, Integer>(fanDetail);

        List fanName = new ArrayList();
        for (Map.Entry<String, Integer> list : treeMap.entrySet()) { //query key select
            String Qkey = list.getKey();
            fanName.add(Qkey);

        }
        for (int i = 0; i < nPossibleMeet; i++) {
            System.out.println(fanName.get(i));
        }
    }
}
