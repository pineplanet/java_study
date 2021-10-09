package com.encore.java.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 배열 처럼 데이터를 다루는 collection
// 인덱스, 순서를 가지고 있어서 데이터의 중복이 허용
//java.lang.ArrayList

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Object o = new Object();
        String s = new String();

        list.add(o);
        list.add(s);

        list.get(1); //return 값이 object 주소로 나옴
        //type casting 해야 함.
        ArrayList<String>list2 = new ArrayList<String>();
        //list2.add(o);
        list2.add(s);
        list2.get(0).toString();

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("서울");
        list3.add("상해");
        list3.add("도쿄");
        list3.add("LA");
        list3.add("서울");

        System.out.println(list3.size());
        for (String value : list3) {
            System.out.println(value);
        }
        System.out.println(list3);//toString이 오버라이딩 된거?
        //ArrayList index
        System.out.println(list3.indexOf("서울"));
        System.out.println(list3.lastIndexOf("서울"));
        //ArrayList remove
        list3.remove("LA");
        System.out.println(list3);

        list3.remove(2);
        System.out.println(list3);
        System.out.println(list3.contains("LA"));

        // Collection -> 배열 변환
        Object[] obj = list3.toArray();
        System.out.println(Arrays.toString(obj));

        String[] cities = new String[0];
        cities = list3.toArray(cities);
        System.out.println(Arrays.toString(cities));

        //모든 요소 삭제
        list3.clear();
        System.out.println(list3);
        // 비어있는 collection인지 확인
        System.out.println(list3.isEmpty());

        list3.add("파리");
        list3.add("방콕");
        list3.add("LA");

        System.out.println(list3);

        //Arrays 사용

        List<String> list4 =Arrays.asList("서울" ,
                "뉴욕" ,
                "상해");
        System.out.println(list4);
        list3.addAll(list4);
        System.out.println(list3.containsAll(list4));

        //현재 콜렉션에서 인자들을 제거
        list3.retainAll(list4);
        System.out.println(list3);

        list3.addAll(list4);
        list3.remove(list4);
        System.out.println(list3);
    }
}
