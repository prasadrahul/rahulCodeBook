package com.prasad.hackerearth.moonfroglabs;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class TestClass {
    public static void main(String[] args) throws Exception{

        //nSizeArray - 1st Column[0] (size of Array)
        //kInteger  -1st Column[1] (K- Integer such that F(a)+ F(b) >= K)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new FileReader("resource\\vanya_array.txt"));
        String line = br.readLine();
        String[] qData = line.split(" ");

        int nSizeArray = Integer.parseInt(qData[0]); // N
        int kInteger = Integer.parseInt(qData[1]);  // K

        String nextLine = br.readLine();
        String[] arrayData = nextLine.split(" ");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int n = 0; n < nSizeArray ; n++) {
            arrayList.add(Integer.parseInt(arrayData[n]));

        }

        ArrayList<Integer> funcList = new ArrayList<Integer>();

        for (int i = 0; i < nSizeArray ; i++) {
            funcList.add(getFunctionArray(arrayList,nSizeArray , i));
        }


        getDistinctUnorderedPairs(funcList ,nSizeArray, kInteger);

    }

    private static void getDistinctUnorderedPairs(ArrayList<Integer> funcList, int nSizeArray, int kInteger) {

        int distinctPairs = 0;
        for (int i = 0; i <nSizeArray ; i++) {
            for (int j = i+1 ; j < nSizeArray ; j++) {

                if (funcList.get(i)+funcList.get(j) >= kInteger)
                {
                    distinctPairs = distinctPairs + 1 ;
                }


            }
        }
        System.out.println(distinctPairs);
    }

    private static int getFunctionArray(ArrayList<Integer> arrayList,int nSizeArray, int i) {

        int funData = 0 ;
        for (int k = i+1 ; k < nSizeArray ; k++) {

            if( arrayList.get(i) < arrayList.get(k) )
            {
                funData = funData + 1 ;
            }else
            {
                funData = funData + 0;
            }
        }
        return funData;
    }


}
