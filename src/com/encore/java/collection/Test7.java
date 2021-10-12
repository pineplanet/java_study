package com.encore.java.collection;

import java.util.Hashtable;

public class Test7 {

    public static void main(String[] args) {
        Hashtable<String,String> dic = new Hashtable<>();
        dic.put("고진감래","고생 끝에 즐거움이 옴");
        dic.put("분골쇄신","몸이 부서질정도로 노력을 다함");
        dic.put("권토중래","실패를 발판 삼아 재기함");
        dic.put("교학상자","가르치고 배우면서 서로 성장함");
        //dic.put(null,null); //에러남 -> hash Map 과의 차이
        System.out.println(dic);
        System.out.println(dic.keySet());
        System.out.println(dic.values());
        System.out.println(dic.get("고진감래"));
        System.out.println(dic.contains("실패를 발판 삼아 재기함"));

        dic.remove("고진감래");
        System.out.println(dic.get("고진감래"));

        dic.clear();
    }
}
