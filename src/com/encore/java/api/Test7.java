package com.encore.java.api;

import JS.Array;
import com.sun.jdi.connect.AttachingConnector;

import java.util.Calendar;
import java.util.Date;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] score = {85, 90, 95, 100, 75};

        //배열 복사
        int[] score2 = new int[score.length];
        System.arraycopy(score, 0, score2, 0, score.length);

        int[] score3 = Arrays.copyOf(score, score.length);

        for (int n :
                score) {
            System.out.println(n);
        }
        //배열 요소 출력
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(score2));
        System.out.println(Arrays.toString(score3));

        //배열 비교
        System.out.println(Arrays.equals(score,score2));

        //배열 정렬
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        //배열 요소 검색
        int idx = Arrays.binarySearch(score,100);
        System.out.println(idx);

        //java.util.date, calendar
        //date는 locale을 지정할수가 없음

        Date d = new Date();
        System.out.println(d);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));



    }

}
