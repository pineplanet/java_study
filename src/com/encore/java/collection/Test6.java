package com.encore.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test6 {
    public static void main(String[] args) {
        HashMap<String,String> dic = new HashMap<>();
        dic.put("고진감래","고생 끝에 즐거움이 옴");
        dic.put("분골쇄신","몸이 부서질정도로 노력을 다함");
        dic.put("권토중래","실패를 발판 삼아 재기함");
        dic.put("교학상자","가르치고 배우면서 서로 성장함");

        dic.put(null,null);

        //System.out.println(dic.get(args[0]));

        Iterator <String> keys = dic.keySet().iterator();
        while(keys.hasNext()){
            String key = keys.next();
            System.out.println(key+":"+dic.get(key));
        }
        System.out.println("-----------------------------");
        for (String key:dic.keySet()
             ) {
            System.out.println(key+":"+dic.get(key));
        }
        System.out.println("------------------------------");
        for (Map.Entry<String,String> item :dic.entrySet()
             ) {
            System.out.println(item.getKey()+":"+item.getValue());

        }
        dic.remove("고진감래");
        System.out.println(dic.get("고진감래"));
    }

}
