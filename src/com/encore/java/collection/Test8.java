package com.encore.java.collection;

import java.util.TreeMap;

public class Test8 {
    public static void main(String[] args) {
        TreeMap<String,String> users = new TreeMap<>();
        users.put("20080319","김푸름");
        users.put("20070620","김하늘");
        users.put("20050817","홍길동");
        users.put("20120728","김유빈");
        users.put("20120924","이순신");
        System.out.println(users);
        System.out.println(users.firstEntry());
        System.out.println(users.lastEntry());
        System.out.println("---------------------------------");
        System.out.println(users.lowerEntry("20130101")); //바로 이전 데이터 추출
        System.out.println(users.higherEntry("20111231")); // 바로 다음 데이터 추출
        System.out.println("---------------------------------");
        while(!users.isEmpty()){
            System.out.println(users.pollFirstEntry());
            System.out.println(users);
        }

    }

}
