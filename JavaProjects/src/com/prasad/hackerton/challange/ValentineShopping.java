package com.prasad.hackerton.challange ;

/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.FileReader;
//import java.io.InputStreamReader;


class ValentineShopping {
    public static void main(String args[] ) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("bookmyshow.txt"));
        String line = br.readLine();
        int N = Integer.parseInt(line);


        int finalChoice = 0 ;
        
        for (int i = 0; i < N; i++) {

            String nextDetail = br.readLine();
            String itemShopDetails = "";

            int savedDiscount = 0 ;
            int finalDiscount  ;

//            while((itemShopDetails = br.readLine()) != null) {

                String [] details = nextDetail.split(" ");
                String itemDetails = details[0].toString();
                String shopDetails = details[1].toString();
//        System.out.println("itemDetails" + itemDetails );
//        System.out.println("shopDetails!" + shopDetails );

                int item = Integer.parseInt(itemDetails);
                int shop = Integer.parseInt(shopDetails);


            for (int k = 0 ; k < item ; k++) {

//                System.out.println("Decide item wise shop loop ");

                for (int j = 0 ; j < shop  ; j++) {

//                    System.out.println("Decide  shop wise discount loop ");
                    String discount = br.readLine();
                    String[] discountDetails = discount.split(" ");

                    String firstDiscount = discountDetails[0].toString();
                    String secondDiscount = discountDetails[1].toString();
                    String thirdDiscount = discountDetails[2].toString();

                    int firstD = Integer.parseInt(firstDiscount);
                    int secondD = Integer.parseInt(secondDiscount);
                    int thirdD = Integer.parseInt(thirdDiscount);

                    //Logic to select shop with more discount

                    int midDiscount= (firstD + secondD - (firstD * secondD / 100));

                    finalDiscount = (midDiscount + thirdD - (midDiscount * thirdD / 100));

//                    System.out.println("finalDiscount : " + finalDiscount);
//                    System.out.println("finalDiscount : " + finalDiscount);
//                    System.out.println("firstDiscount : " + firstDiscount);
//                    System.out.println("secondDiscount : " + secondDiscount);
//                    System.out.println("thirdDiscount : " + thirdDiscount);

                    
                    if (savedDiscount < finalDiscount ) {
                        savedDiscount = finalDiscount;
//                        System.out.println("savedDiscount : " + savedDiscount);
                         finalChoice = j + 1 ;
//                        System.out.println("finalChoice : " + finalChoice);

                    }


                }

                System.out.print( finalChoice + " ");

            }
            System.out.println( " ");


        }

//        System.out.println("Hello World!");
    }
}
