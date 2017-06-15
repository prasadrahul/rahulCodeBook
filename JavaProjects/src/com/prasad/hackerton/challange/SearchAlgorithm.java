//package com.mavenhive.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Page Search by Keywords using given search algorithm.
 */
 
public class SearchAlgorithm {

    public static int max_Keyword = 8; // N -- Max number of key word
    public static BufferedReader bin = null;
    public static String line = "";
    public static String splitBy = " ";

    public static int indexP = 1;
    public static int indexQ = 1;


    public static void main(String[] args) {

        // TreeMap for Storing PageDetails
        Map<String, TreeMap<String, Integer>> mapWebPage = new TreeMap<String, TreeMap<String, Integer>>();

        // TreeMap for Storing QueryDetails
        Map<String, TreeMap<String, Integer>> mapQuery = new TreeMap<String, TreeMap<String, Integer>>();

        // Taking Input From File Name: "inputdata.txt"
        //********************
        /*
        P Ford Car Review
        P Review Car
        P Review Ford
        P Toyota Car
        P Honda Car
        P Car
        Q Ford
        Q Car
        Q Review
        Q Ford Review
        Q Ford Car
        Q cooking French
        */
        //**********************

        storeDetails(mapWebPage, mapQuery);

        smartSearch(mapWebPage, mapQuery);

        System.out.println("");
        System.out.println("");

    }

    private static void storeDetails(Map<String, TreeMap<String, Integer>> mapWebPage, Map<String, TreeMap<String, Integer>> mapQuery) {
        try {
            bin = new BufferedReader(new FileReader("inputdata.txt"));
            line = bin.readLine(); // read only first line

            while (line != null) {
                String[] keywords = line.split(splitBy);

                // Inserting PageDetails
                if (keywords[0].equals("P")) {
                    mapWebPage.put("P" + indexP, readPage(line));

                    indexP++;
                }

                // Inserting QueryDetails
                if (keywords[0].equals("Q")) {
                    mapQuery.put("Q" + indexQ, readPage(line));

                    indexQ++;
                }

                line = bin.readLine(); // read after first line
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bin != null) {
                try {
                    bin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }

    // Method For Inserting Keywords Data in Internal TreeMap with Index
    private static TreeMap readPage(String line) {


        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

        String[] keywords = line.split(splitBy);

        if (keywords != null) {

            // Inserting Data in TreeMap for Given Key Details with Indexing to each Key
            for (int i = 1; i < keywords.length; i++) {
                treeMap.put(keywords[i], max_Keyword - i + 1);
            }

        }

//        System.out.println(" :" + treeMap);
        return treeMap;
    }


    private static void smartSearch(Map<String, TreeMap<String, Integer>> mapWebPage, Map<String, TreeMap<String, Integer>> mapQuery) {

        String Pkey = null;
        int Pvalues = 0;

        String webPageKey = null;

        //Query select
        for (Map.Entry<String, TreeMap<String, Integer>> mapList : mapQuery.entrySet()) {


            String queryKey = mapList.getKey();

            // Printing format for search Result
            System.out.println(" ");
            System.out.print(queryKey + ":");

            TreeMap<String, Integer> valuesQuery = mapList.getValue();

            // Map For Storing Page Details according to calculated strength
            TreeMap<String, Integer> resultMap = new TreeMap<String, Integer>();

            //page select
            for (Map.Entry<String, TreeMap<String, Integer>> mapPage : mapWebPage.entrySet()) {

                int indexStrength = 0;
                int passvalue = 0;

                webPageKey = mapPage.getKey();

                TreeMap<String, Integer> valuesPage = mapPage.getValue();

                // Internal query Details selected
                for (Map.Entry<String, Integer> list : valuesQuery.entrySet()) { //query key select
                    String Qkey = list.getKey();
                    Integer Qvalues = list.getValue();

                    //Internal Page Details selected
                    for (Map.Entry<String, Integer> listP : valuesPage.entrySet()) { //page key


                        Pkey = listP.getKey();
                        Pvalues = listP.getValue();

                        int localmulValue = 0;

                        // Logic for Comparing the key and allocating strength to that Page
                        if (Qkey.equals(Pkey)) {

                            localmulValue = Qvalues * Pvalues;

                            // to cover mutiple key in single page and need to select scope of variable carefully
                            indexStrength = indexStrength + localmulValue;

                            //update index for at least one page. (for multiple keys)
                            resultMap.put(webPageKey, indexStrength);

                            passvalue = indexStrength;

                        }

                    }//page internal loop end

                    if (Qkey.equals(Pkey)) {

                        // update index for same key but in different page
                        resultMap.put(webPageKey, passvalue);

                    }

                }// Query Internal loop end

            } //Page main loop end

            Map<Integer, String> map = sortMapByValues(resultMap);
            Set set = map.entrySet();
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
                Map.Entry ansMap = (Map.Entry) iterator.next();
                System.out.print(ansMap.getKey() + " ");   // print sorted page in Output.
            }


        } //Query main loop end


    }

    private static HashMap sortMapByValues(TreeMap map) {
        List list = new LinkedList(map.entrySet());

        // Defining Custom Comparator
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {

                // Reverse the comparison to print data in descending order of Index.
                return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Copying the sorted list in HashMap
        // LinkedHashMap is used to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }


}
