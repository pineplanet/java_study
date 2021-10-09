package com.encore.java.api;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

//java.util
public class Test6 {

    //java.util.StringTokenizer

    public static void main(String[] args) {
        String msg = "Although the world is full of suffering, it is full also of the overcoming of it.";

        StringTokenizer st1 = new StringTokenizer(msg);
        System.out.println("단어 수 : "+st1.countTokens());

        String s = "id=guest&name=amy&pwd=1004";
        StringTokenizer st2 = new StringTokenizer(s,"&");
        while (st2.hasMoreTokens()){
            System.out.println("남아 있는 토큰 수 : "+st2.countTokens());
            System.out.println(st2.nextToken());//커서 이동

        }
        StringTokenizer st3 = new StringTokenizer(s,"=&");//= or &
        System.out.println("=================");
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());

        }
        //java.util.Random
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(r.nextInt());
            System.out.println(r.nextInt(10));
            System.out.println(r.nextBoolean());
            System.out.println(r.nextFloat());
            System.out.println("-----------------");
        }
        //java.util.Arrays
        int[] score = {85,90,95,100,75};

        //System.arraycopy(); 말고 다른거

        int[] score3 = Arrays.copyOf(score,score.length);


    }
}
