package com.prasad.hackerearth.sepclash16;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Details Here
 */
public class KevinGCD {
    public static void main(String[] args) throws Exception{

//              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\kevin_gcd.txt"));
        String line = br.readLine();
        int nQuery = Integer.parseInt(line);

        for (int i = 0; i < nQuery ; i++) {
            String qLine = br.readLine();
            long qdata =  Integer.parseInt(qLine);

            long count = 0;

            for (long j = 1; j <= qdata ; j++) {
                for (long k = 1; k <= qdata ; k++) {
//                    long ansGCD = findGCD(j,k);
//                    long andKGCD = findKevinGCD(j,k);

                    if(findKevinGCD(j,k) == findGCD(j,k) )
                    {
                        count = count + 1;
                    }



                }
            }

            System.out.println(count);
        }

    }

    private static long findKevinGCD(long a, long b) {
            long temp ;
            while (a > 0 && b > 0)
            {
                a -= b;

                temp = a;
                a = b;
                b = temp;
            }
            return a + b;
    }

    private static long findGCD(long num1, long num2) {
        if(num2 == 0)
        {
            return num1;
        }
        return findGCD(num2, num1%num2);
    }
}
