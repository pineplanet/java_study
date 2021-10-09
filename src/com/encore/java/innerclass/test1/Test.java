package com.encore.java.innerclass.test1;

public class Test {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.name = "aaa";
        //obj.test();
        OuterClass.InnerClass inner = obj.new InnerClass();
        inner.a = 123;
        inner.method2();

    }
}
