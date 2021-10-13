package com.encore.java.io;
import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("a.txt");
            FileOutputStream fo = new FileOutputStream("b.txt");
            int c = 0;
            System.out.println(c);
            while((c = fi.read())!=-1){
                System.out.print((char)c);
                fo.write(c);
            }
            fi.close();
            fo.close();

        }catch(Exception e){
            System.out.println(e);
        }


    }
}
