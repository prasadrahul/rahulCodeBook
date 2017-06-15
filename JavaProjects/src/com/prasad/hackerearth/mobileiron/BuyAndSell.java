package com.prasad.hackerearth.mobileiron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Buy and Sell !
 A good and robust is always difficult to design, however, its benefits are unlimited and is much better in the long term.

 Today, you need to do just the same, i.e. you need to create a system to successfully process the incoming and outgoing stock of a retail outlet.

 The outlet stocks and sells
 N
 N types of items. Each item has a name and a price per unit associated with it. The name of each item on sale is guaranteed to be unique. You shall be given the names and prices for each of the
 N
 N items.

 Now, based on this list of items, You need to process 3 types of queries:

 +
 X
 +X : Given a String X, add one unit of item X to the available stock. It is guaranteed that item X shall be among the list of items the shop trades in.

 −
 X
 −X: If item X exists in the available stock, remove one occurrence of it from the available stock.

 ?

 Y
 ? Y : Now, you need to find the summation of available units of each item having price strictly greater than
 Y
 Y.

 Initially the stock list is empty. For each query of the 3rd type, you need to print the answer on a new line.

 Input Format :

 The first line contains a single integers
 N
 N denoting the number of items the shop trades in. Each of the next
 N
 N lines contains a String
 X
 i
 Xi and an integer
 k
 i
 ki where the
 i
 t
 h
 ith line denotes that the
 i
 t
 h
 ith item has name
 X
 i
 Xi and price
 k
 i
 ki. The next line contains a single integer
 Q
 Q. Each of the next
 Q
 Q lines contains either of the
 3
 3 types of queries. The first symbol of each query denotes the type of query. A symbol '+' denotes the first type of query, '-' denotes a query of the second type, '?' of the third respectively.

 Output Format :

 For each query of the 3rd type, print the answer on a new line

 Constraints :

 1
 ≤
 N
 ≤
 10
 5
 1≤N≤105
 1
 ≤
 Q
 ≤
 10
 5
 1≤Q≤105
 1
 ≤
 |
 X
 i
 |
 ≤
 10
 1≤|Xi|≤10

 1
 ≤
 k
 i
 ≤
 10
 5
 1≤ki≤105

 0
 ≤
 Y
 ≤
 10
 5
 0≤Y≤105

 Note :

 The name of each item on sale shall consist of lowercase English alphabets only

 Sample Input(Plaintext Link)
 5
 banana 10
 biscuit 5
 apple 10
 mango 1
 juice 14
 5
 + banana
 + apple
 ? 1
 + mango
 ? 0
 Sample Output(Plaintext Link)
 2
 3
 Explanation
 For the third query, the available stock consists of
 1
 1 unit of banana and
 1
 1 one unit of apple, thus the answer is equal to
 1
 1 +
 1
 1 =
 2
 2.
 *
 */

public class BuyAndSell {


    public static void main(String[] args) throws Exception{

        HashMap<String, Integer> mapStock = new HashMap<String, Integer>();

        HashMap<String, Integer> mapStockCount = new HashMap<String, Integer>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\buy_sell.txt"));
        String line = br.readLine();
        int nItemForTrade = Integer.parseInt(line);

        for (int i = 0; i < nItemForTrade ; i++) {

            String nextLine = br.readLine();
            String[] qItemDetail = nextLine.split(" ");

            String nItemName = qItemDetail[0]; // Item
            int nItemPrice = Integer.parseInt(qItemDetail[1]);  // Price

            storeItemDetails(mapStock,nItemName, nItemPrice);
        }

        String readQueryNumber = br.readLine();
        int nQuery = Integer.parseInt(readQueryNumber);

        for (int j = 0; j < nQuery ; j++) {

            String queryLine = br.readLine();
            String[] queryData = queryLine.split(" ");

            String queryType = queryData[0]; // Item
            String queryItem = queryData[1];  // Price

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
                    System.out.println(mapStockCount);
                }

            }
        }

        if (queryType.equals("-")) {
            for (String key : mapStock.keySet()) {

                if (key.equals(queryItem) )
                {
                    subValue = subValue + 1;
                    mapStockCount.put(key, subValue);
                    System.out.println(mapStockCount);
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

