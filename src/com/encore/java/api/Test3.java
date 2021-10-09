package com.encore.java.api;
//java.lang.StringBuffer // StringBuilder

public class Test3 {
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer("날이 좋아서");
        StringBuilder sb = new StringBuilder("날이 좋아서");
        System.out.println(sb);
        System.out.println(sb.append("날이 적당해서"));
        System.out.println(sb);
        // 원본이 변경된다.

        System.out.println(sb.insert(13,"aaa"));
        System.out.println(sb.length());

        System.out.println(sb.replace(7,17,"good"));


    }
}
