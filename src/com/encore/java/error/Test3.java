package com.encore.java.error;

import java.io.IOException;

public class Test3{
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("에러 발생");
        }
    }
    public static void test() throws ClassNotFoundException, IOException {
       Class.forName("");
       System.in.read();

    }
}
