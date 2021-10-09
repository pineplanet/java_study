package com.encore.java.innerclass.test1;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkerList myList = new MyLinkerList();
        myList.print();

        myList.add("JAVA"); //head null -> head = new node
        myList.add("JSP"); // head !null -> next null = next.link = newnode
        myList.add("Servlet");
        myList.add("Python");
        myList.print();
    }
}

