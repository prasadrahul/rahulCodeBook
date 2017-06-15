package com.prasad.hackerearth.julyclash;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Sabotage {
    public static void main(String args[]) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("sabotage.txt"));


        String line1 = br.readLine();
        String [] details = line1.split(" ");
        String noCountries = details[0].toString();
        String noFlights = details[1].toString();

        Integer countries = Integer.parseInt(noCountries);
        Integer flights = Integer.parseInt(noFlights);

        // TreeMap for Storing PageDetails
        Map<Integer ,Map < Integer, Integer> > mapFlightDetail = new TreeMap<Integer, Map < Integer, Integer>>();

        storeDetails(countries,flights, mapFlightDetail);
        processDetails(countries, mapFlightDetail);


    }

    static void storeDetails(int countries, int flights, Map<Integer, Map<Integer, Integer>> mapFlightDetail) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("resource\\sabotage.txt"));
        String line = br.readLine();

        for (int i = 1; i <= flights ; i++) {

            String line2 = br.readLine();
            String [] fDetails = line2.split(" ");
            String depCountry = fDetails[0].toString();
            String arrCountry = fDetails[1].toString();

            Integer depCcountries = Integer.parseInt(depCountry);
            Integer arrCcountries = Integer.parseInt(arrCountry);

            TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

            treeMap.put(depCcountries,arrCcountries);
            mapFlightDetail.put(i , treeMap );

            System.out.println( mapFlightDetail ); //
        }

    }

    static void processDetails(Integer countries, Map<Integer, Map<Integer, Integer>> mapFlightDetail) {


        Integer count = countries ;
        for (Map.Entry<Integer, Map<Integer, Integer>> mapList : mapFlightDetail.entrySet()) {

            Integer index = mapList.getKey(); // index
            TreeMap<Integer, Integer> flightDetail  = (TreeMap<Integer, Integer>) mapList.getValue();

            for (Map.Entry<Integer, Integer> flightList : flightDetail.entrySet()) {
                Integer depFlight = flightList.getKey(); // depCountry
                Integer arrFlight = flightList.getValue(); // arrCountry

                System.out.println(depFlight + ":" + arrFlight);

                if (depFlight == depFlight) {

                }
            }

        }

    }

}
