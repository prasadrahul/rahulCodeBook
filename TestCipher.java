//package com.cipher.hackerton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestCipher {

    public static BufferedReader bin = null;

    public static String cipherKey = null ;
    public static String cipherText = null ;


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        try{
//            bin = new BufferedReader(new InputStreamReader(System.in));
              bin = new BufferedReader(new FileReader("inputdata.txt"));

//            String cipherKey;
//            String cipherText;

                cipherKey = bin.readLine();
                System.out.println("First :" + cipherKey);
                cipherText = bin.readLine();
                System.out.println("Second :" + cipherText );

        }catch(IOException io){
            io.printStackTrace();
        }

//        string[i]=cipherKey[i]^cipherText[j];
        String hex = cipherText;

//        System.out.println("Second is:" + cipherText );
//        String hex = "75546f7272656e745c436f6d706c657465645c6e667375635f6f73745f62795f6d757374616e675c50656e64756c756d2d392c303030204d696c65732e6d7033006d7033006d7033004472756d202620426173730050656e64756c756d00496e2053696c69636f00496e2053696c69636f2a3b2a0050656e64756c756d0050656e64756c756d496e2053696c69636f303038004472756d2026204261737350656e64756c756d496e2053696c69636f30303800392c303030204d696c6573203c4d757374616e673e50656e64756c756d496e2053696c69636f3030380050656e64756c756d50656e64756c756d496e2053696c69636f303038004d50330000";

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < hex.length(); i+=2) {
            String str = hex.substring(i, i+2);
//            System.out.println("Inside Loop:" + str);
            output.append((char)Integer.parseInt(str, 16));
        }

        System.out.println( "Hex-Output:" + output.length() + " : "  );


        System.out.print( "XOR-ing back to original: "+ xorMessage( output.toString(), cipherKey ) );




    }


    public static String xorMessage(String message, String key){
        try {
            if (message==null || key==null ) return null;

            char[] keys=key.toCharArray();
            char[] mesg=message.toCharArray();

            int ml=mesg.length;
            int kl=keys.length;
            char[] newmsg=new char[ml];

            for (int i=0; i<ml; i++){
                newmsg[i]=(char)(mesg[i]^keys[i%kl]);
            }//for i
//            mesg=null; keys=null;
            return new String(newmsg);
        }
        catch ( Exception e ) {
            return null;
        }
    }//xorMessage

}
