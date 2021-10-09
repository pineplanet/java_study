package com.encore.java.api;

import java.util.Locale;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = new String("java");

        String s3 = "java";
        String s4 = new String("java");

        //차이점 :
        System.out.println(s1 == s3);
        System.out.println(s2==s4);
        //equals
        String s5 = "Java";
        System.out.println(s5.equalsIgnoreCase(s1));
        //int length
        System.out.println(s5.length());
        //char charAt(index): 지정된 인덱스에 해당하는 문자 추출
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i)+" ");

        }
        System.out.println();
        //String trim(): 양쪽 공백제거
        String s6 = "     Amy        ";
        String s7 = s6.trim(); //원본 변경 불가
        System.out.println(s6.length());
        System.out.println(s7.length());


        //문자 검색
        // int indexOf() / int lastIndexOf()
        String s8 = "apple banana melon apple kiwi";
        System.out.println(s8.indexOf("apple"));
        System.out.println(s8.lastIndexOf("apple"));

        //문자열 편집
        //결합 : concat()
        //변경 : replace()
        //대문자로 변경 : toUpperCase()
        //소문자로 변경 : toLowerCase()

        System.out.println("=== 문자열 편집 === ");
        String s = "Everything in your world is created";

        String ss2 = s.concat(" by what you think");
        System.out.println(ss2);

        String ss3 = ss2.replaceAll(" by what you think", "by your thoughts");

        System.out.println(s.toLowerCase());
        System.out.println(s.toLowerCase());


        //문자열 추출
        //split() 구분자로 문자열 자르기
        //substring() 인덱스로 잘라내기 end index-1까지 잘라서 줌
        String nation = "한국,일본,중국,미국,독일,프랑스";
        String[] list = nation.split(",");
        for (int i = 0; i <list.length  ; i++) {
            System.out.println(list[i]);
        }
        String[] list2 = nation.split(",",2);
        for (String item:list2) {
            System.out.println(item);
        }
        String email = "purum@encore.co.kr";
        //indexOf
        int idx = email.indexOf("@");
        String id = email.substring(0,idx);
        System.out.println(id);
        String domain = email.substring(idx+1);
        System.out.println(domain);


        System.out.println("=== 문자열 변환===");
        // String 타입 변환 :
        //valueOf()
        String c1 = String.valueOf(true);
        String c2 = String.valueOf('A');
        String c3 = String.valueOf(3.14);
        String c4 = String.valueOf(123);
        String c5 = String.valueOf(new A());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        System.out.println(123+"");


    }
}
class A{}