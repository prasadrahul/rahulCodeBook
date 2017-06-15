package com.prasad.local;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rahul on 06/19/2016.
 */
public class PrintOddNumber {

    public static void main(String[] args) throws IOException {


        File file = new File("Hello1.txt");
        // creates the file
        file.createNewFile();
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        // Writes the content to the file

        for (int a = 0; a < 50; a++) {

            if (a%2 != 0)
            {
//                writer.write(a);
//                writer.flush();
//                writer.close();
                System.out.println(a);
            }

        }


    }
}
