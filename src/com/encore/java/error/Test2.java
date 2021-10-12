package com.encore.java.error;

public class Test2{
    public static void main(String[] args) {
        try {
            System.out.println("1");
            String a = null;
            //a.length();
            System.out.println("2");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("3");
        }finally {
            System.out.println("무조건 실행 ");
        }
        System.out.println("4");
    }
}
