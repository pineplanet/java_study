package com.encore.java.io;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Test2 {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in;
            PrintStream console =  System.out;
            int c = 0;
            while((c =keyboard.read()) != -1){
                console.write(c);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
