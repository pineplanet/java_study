package com.encore.java.api;
//java.lang.Object 테스트
public class Test1 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj4.hashCode());

        Class c = obj1.getClass();
        //클래스 정보를 가지고 있는 객체

        System.out.println(c.getName());

        Book b = new Book();
        Class b_info = b.getClass();
        System.out.println(b_info.getName());

        Class b_info2 = Book.class;

        System.out.println(obj1); //obj.toSting();
        System.out.println(b);
    }
}

class Book{
    @Override
    public String toString() {
        return "BOOK";
    }
}