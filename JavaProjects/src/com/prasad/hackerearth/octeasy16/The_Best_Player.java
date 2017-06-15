package com.prasad.hackerearth.octeasy16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @author  Rahul Prasad
 * It's Lolympics 2016 right now, and we all know who's the best player there right now: Kalyani! Obviously,
he has a huge female fan following and he has to make sure they are all happy and rooting for him to win the gold medals.
But with fan following comes arrogance and lack of time. Thus, he has sufficient time to interact with atmost T of his fans.
Each fan is defined by two parameters : Name and Fan Quotient. The name defines the name of the fan, while the fan quotient
is a measure of the fan's devotion towards Kalyani. Higher the fan quotient, greater is the devotion. Kalyani now wants to
meet T of his fans. While selecting the fans he wants to meet, he wants to make sure that a fan with a higher fan quotient
should be given a chance in favour of those with lesser fan quotient. In case of ties, he sorts their name lexicographically
and chooses the lexicographically lesser named fan.

Given details of N fans, can you help out Kalyani by giving him a list of fans he would be interacting with?

Input Format :
The first line contains N and T, the number of fans and the maximum number of fans Kalyani can meet.
Each of the next N lines contains a string and an integer separated by a space. The string denotes the name of the fan
while the integer depicts the fan quotient.

Output Format :

Output T lines, each containing the name of the fans selected. Fans with higher fan quotient should be outputted
first and in case of a tie, the lexicographically minimum name should come first.

Constraints :

1≤T≤N≤1000
1≤lengthofname≤20
1≤fanquotient≤109
Name would only consist of characters in set [a-z]. It is not guaranteed that the names are distinct.

SAMPLE INPUT
3 2
surbhi 3
surpanakha 3
shreya 5
SAMPLE OUTPUT
shreya
surbhi
*
*/

public class The_Best_Player {
    public static void main(String[] args) throws Exception {

//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\the_best_player.txt"));
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

        Map<String, Integer> treeMap = sortMapByValues(fanDetail);

        List fanName = new ArrayList();

        for (Map.Entry<String, Integer> list : treeMap.entrySet()) {
            String Qkey = list.getKey();
            fanName.add(Qkey);

        }
        for (int i = 0; i < nPossibleMeet; i++) {
            System.out.println(fanName.get(i));
        }

    }

    private static HashMap sortMapByValues (HashMap map){
            List list = new LinkedList(map.entrySet());

            Collections.sort(list, new Comparator() {
                public int compare(Object o1, Object o2) {
                    return ((Comparable) ((Map.Entry) (o2)).getValue()).compareTo(((Map.Entry) (o1)).getValue());
                }
            });

            HashMap sortedHashMap = new LinkedHashMap();
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                Map.Entry entry = (Map.Entry) it.next();
                sortedHashMap.put(entry.getKey(), entry.getValue());
            }
            return sortedHashMap;
        }

}