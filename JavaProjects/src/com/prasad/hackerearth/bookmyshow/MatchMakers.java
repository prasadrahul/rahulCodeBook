package com.prasad.hackerearth.bookmyshow;

import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
//import java.io.InputStreamReader;


/**
 * Little Mojo owns a match making company, which even to her surprise is an extreme hit.
 * She says that her success rate cannot be matched (Yeah, wordplay!) in the entire match-making industry.
 * She follows an extremely simple algorithm to determine if two people are matches for each other. Her algorithm is not at all
 * complex, and makes no sense - not even to her. But she uses it anyway.
 * Let's say say that on a given day she decides to select n people - that is, n boys and n girls.
 * She gets the list of n boys and n girls in a random order initially. Then, she arranges the list of girls in ascending order
 * on the basis of their height and boys in descending order of their heights. A girl Ai can be matched to a boy on the
 * same index only, that is, Bi and no one else. Likewise, a girl standing on Ak can be only matched to a boy on the
 * same index Bk and no one else.
 * <p/>
 * Now to determine if the pair would make an ideal pair, she checks if the modulo of their heights
 * is 0, i.e., Ai % Bi == 0 or Bi % Ai == 0. Given the number of boys and girls, and their respective heights in non-sorted
 * order, determine the number of ideal pairs Mojo can find.
 * <p/>
 * Input format:
 * The first line contains number of test cases. Then, the next line contains an integer, n,
 * saying the number of boys and girls. The next line contains the height of girls, followed by the height of boys.
 * <p/>
 * Output format:
 * Print the number of ideal pairs corresponding to every test case.
 * <p/>
 * Constraints:
 * 1 <= Test Cases <= 102
 * 1 <= N <= 104
 * 1 <= A i , B i <= 105
 * <p/>
 * <p/>
 * Sample Input:
 * 2
 * 4
 * 1 6 9 12
 * 4 12 3 9
 * 4
 * 2 2 2 2
 * 2 2 2 2
 * <p/>
 * Sample Output:
 * 2
 * 4
 */

/* IMPORTANT: class must not be public. */
class MatchMakers {

    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\matchmakers.txt"));
        String line = null;

        while (( line = br.readLine()) != null) {
//            System.out.println(line);
//        }
            long N = Integer.parseInt(line);  // 2

            for (int n = 0; n < N; n++) {

                String studentDetail = br.readLine();  //4
                int studentCount = Integer.parseInt(studentDetail);

                String boyDetail = br.readLine();  //4
                String girlDetail = br.readLine();  //4

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

//            System.out.println("Array " + girl[0]%boy[1]);

                int j = 0;
                for (int i = 0; i < studentCount; i++) {
//            System.out.println("Boy  : " + boy[i]);
//            System.out.println("Girl : " + girl[i]);

                    if (girl[i] % boy[i] == 0 || boy[i] % girl[i] == 0) {

                        j++;

                    }
                }

                System.out.println(j);


            }


        }

    }
}

