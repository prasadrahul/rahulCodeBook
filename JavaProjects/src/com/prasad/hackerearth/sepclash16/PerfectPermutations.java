package com.prasad.hackerearth.sepclash16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

/**
 * Created by rahul on 09/10/2016.
 */
public class PerfectPermutations {
    public static void main(String[] args) throws Exception {

//              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("resource\\prefect_per_cmb.txt"));
        String line = br.readLine();
        int nQuery = Integer.parseInt(line);

//        BigInteger[] ar = new BigInteger[nQuery];

        for (int i = 0; i < nQuery; i++) {
            String qLine = br.readLine();
            String[] qData = qLine.split(" ");

            long nThing = Integer.parseInt(qData[0]);
            long rAtaTime = Integer.parseInt(qData[1]);
            printPerfectPermutations(nThing,rAtaTime);
        }

    }

    private static void printPerfectPermutations(long nThing, long rAtaTime) {

        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");

        for (long c = (nThing - rAtaTime + 1); c <= nThing; c++) {
            inc = inc.add(BigInteger.ONE);
            fact = fact.multiply(inc);
        }

        System.out.println(fact);
    }
}
