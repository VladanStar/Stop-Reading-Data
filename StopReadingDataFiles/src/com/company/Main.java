package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"));
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
            output.close();

            DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));
            while (true) {
                System.out.println();

            }
            input.close();


        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
