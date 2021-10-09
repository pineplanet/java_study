package com.encore.java.innerclass.test1;

public class OuterClass {
    String name;
    public static void main(String[] args) {

    }
    //내부 클래스 이면서 바깥 클래스의 멤버가 된다.
    class InnerClass{
        int a;
        void method2(){
            System.out.println("Instance Class: "+ a);
        }
    }
}
