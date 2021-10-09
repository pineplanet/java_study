package com.encore.java.collection;
import java.util.ArrayList;
import java.util.Iterator;

//java.util.Iterator
//
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("서울");
        list.add("북경");
        list.add("상해");
        list.add("서울");
        list.add("도쿄");
        list.add("뉴욕");

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        Iterator<String> iter =  list.iterator();
        //iter 객체 가 생성, list 정보를 가져옴
        // 첫번째 요소에 커서를 만들어줌
        while(iter.hasNext()){
            System.out.println(iter.next());

        }
    }



}
