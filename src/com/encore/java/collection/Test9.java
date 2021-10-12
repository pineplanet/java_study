package com.encore.java.collection;

import java.util.HashSet;
import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        HashSet<Integer> lotto = new HashSet<>();
        Random number = new Random();

        for (int i = 0; i < 6; i++) {
            int n = number.nextInt(46   );
            System.out.println(n);
            lotto.add(n);
            // 중복 데이터를 허용하지 않음
            // 1. hashcode 확인
            // 2. equals 확인
        }
        System.out.println(lotto);
        System.out.println(lotto.size());
    }
}
