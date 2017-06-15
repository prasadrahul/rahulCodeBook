package com.prasad.hackerearth.mobileiron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TestClass {


    public static void main(String[] args) throws Exception{

        HashMap<String, Integer> mapStock = new HashMap<String, Integer>();

        HashMap<String, Integer> mapStockCount = new HashMap<String, Integer>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\buy_sell.txt"));
        String line = br.readLine();
        long nItemForTrade = Integer.parseInt(line);

        for (long i = 0; i < nItemForTrade ; i++) {

            String nextLine = br.readLine();
            String[] qItemDetail = nextLine.split(" ");

            String nItemName = qItemDetail[0]; // Item
            int nItemPrice = Integer.parseInt(qItemDetail[1]);  // Price

            storeItemDetails(mapStock,nItemName, nItemPrice);
        }

        String readQueryNumber = br.readLine();
        int nQuery = Integer.parseInt(readQueryNumber);

        for (long j = 0; j < nQuery ; j++) {

            String queryLine = br.readLine();
            String[] queryData = queryLine.split(" ");

            String queryType = queryData[0];  // QueryType
            String queryItem = queryData[1];  // QueryItem

            processQueryData(mapStockCount,mapStock,queryType, queryItem);

        }


    }

    private static void processQueryData(HashMap<String, Integer> mapStockCount, HashMap<String, Integer> mapStock, String queryType, String queryItem) {

        int addValue = 0;
        int subValue = 0;
        if (queryType.equals("+")) {

            for (String key : mapStock.keySet()) {

                if (key.equals(queryItem) )
                {
                    addValue = addValue + 1;
                    mapStockCount.put(key,addValue);
                }

            }
        }

        if (queryType.equals("-")) {
            for (String key : mapStock.keySet()) {

                if (key.equals(queryItem) )
                {
                    subValue = subValue + 1;
                    mapStockCount.put(key, subValue);
                }

            }

        }

        if (queryType.equals("?")) {

            long Count = 0;
            long Y = Integer.parseInt(queryItem);

            for (String key : mapStockCount.keySet()) {
                if (mapStock.get(key) > Y)
                {
                    Count = Count + 1;
                }

            }

            System.out.println(Count);
        }
    }

    private static void storeItemDetails(HashMap<String, Integer> mapStock, String nItemName, int nItemPrice) {
        mapStock.put(nItemName,nItemPrice);
    }

}


