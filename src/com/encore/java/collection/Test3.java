package com.encore.java.collection;


import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Test3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.addElement("서울");
        vector.addElement("도쿄");
        vector.addElement("뉴욕");

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.elementAt(i));
        }
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());

        vector.insertElementAt("파리", 2);
        System.out.println(vector);
        vector.setElementAt("런던", 1);
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        vector.trimToSize();
        System.out.println(vector.capacity());
        System.out.println("==================");
        vector.removeElement("뉴욕");
        System.out.println(vector);
        vector.removeElementAt(1);
        System.out.println(vector);
        vector.removeAllElements();
        System.out.println(vector);
        List<String> list = Arrays.asList("서울", "도쿄", "뉴욕");
        vector.addAll(list);
        System.out.println(vector);
        vector.setSize(6);
        System.out.println(vector.capacity());
        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
