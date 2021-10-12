package com.encore.java.collection;

import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        //객체 생성
        HashMap<String, String> dic = new HashMap<String, String>();

        String[] word = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
        String[] meaning = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
        // 객체 삽입
        for (int i = 0; i < meaning.length; i++) {
            dic.put(word[i], meaning[i]);
        }
        System.out.println(dic);
        System.out.println(dic.size());
        System.out.println(dic.keySet());
        System.out.println(dic.values());
        //value  변경
        dic.replace("HEAVEN", "아주 행복한 감정");
        dic.put("HEAVEN","이상적인 세상");

        System.out.println(dic.containsKey("HEAVEN"));
        System.out.println(dic.containsKey("WONDER"));

        System.out.println(dic.containsKey("BAD"));
        System.out.println(dic.containsKey("자장가"));
        // 요소 삭제
        dic.remove("HEAVEN");
        dic.clear();
        System.out.println(dic);
        //내용 확인
        System.out.println(dic.size());
        System.out.println(dic.isEmpty());


   }
}
