package com.encore.java.collection;
//LinkedList
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        //LinkedList 객체 생성
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<>();
        //요소 삽입
        list.add("서울");
        list.add("북경");
        list.add("상해");

        list.add(1,"LA");
        list.addFirst("런던");
        list.addLast("서울");
        // offer == add ,
        // offer 추가 도중 문제가 발생하면 프로그램 오류를 발생시킴
        // add = 문제 발생 시 false

        list.offer("파리");
        list.offerFirst("로마");
        list.offerLast("베른");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        System.out.println("==============================");
        // 요소 추출
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list);

        // 요소 삭제 + 추출
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);

        //첫번째 요소 추가, 추출:  push, pop()
        list.push("제주");
        System.out.println(list);
        System.out.println(list.pop());

        System.out.println(list.getFirst());

        //요소 검색
        System.out.println(list.indexOf("서울"));
        System.out.println(list.lastIndexOf("서울"));
        System.out.println(list);
        //요소 삭제
        list.removeFirst();
        list.removeLast();
        list.remove();
        list.remove(1);
        list.remove("서울");
        System.out.println(list);





    }
}
