package ch04;

public class Exam04 {
    public static void main(String[] args) {
        Person p = new Person(1, "JIHEE");//new -> 1. 클래스를 찾아가서 heap에 클래스의 멤버변수 생성함
        //Person p2 = new Person();
        Person p2 = new Person(1, "JIHEE", 'F');
        Person p3 = new Person(25, "이순신", 'M', true);
        Person p4 = new Person(25, "유관순", 'F', false, 0);

        p4.getInfo();

        /*p.age = 40;                 //메소드는 code 영역에 만들어짐
                                    //2. 생성자 호출 (멤버변수 초기화 작업)
        p.name = "James";
        p.gender = 'M';
        p.isMarried = true;
        p.childNum = 3;

        p.getInfo();

        Order order = new Order();
        order.orderNo = "20180312001";
        order.id ="abc123";
        order.orderDate = "2018년 3월 12일";
        order.orderName = "홍길순";
        order.productNo = "PD0345-12";
        order.address = "서울시 영등포구 여의도동 20번지";

        System.out.println(order.orderNo);
        System.out.println(order.id);
        System.out.println(order.orderDate);
        System.out.println(order.orderName);
        System.out.println(order.productNo);
        System.out.println(order.address);*/

    }
}

class Person {
    int age;
    String name;
    char gender;
    boolean isMarried;
    int childNum;

    // 생성자 선언을 해보자
    // 리팩토링
    public Person() {
        this(0);
    }

    public Person(int age) {
        this(age, "무명");
    }

    public Person(int age, String name) {
        this(age, name, 'F');
    }

    public Person(int age, String name, char gender) {
        this(age, name, gender, false);
    }

    public Person(int age, String name, char gender, boolean isMarried) {
        this(age, name, gender, isMarried, 0);
    }

    public Person(int age, String name, char gender, boolean isMarried, int childNum) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.isMarried = isMarried;
        this.childNum = childNum;
    }

    public void getInfo() {
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        if (gender == 'F')
            System.out.println("성별:여자");
        else
            System.out.println("성별:남자");
        if (isMarried)
            System.out.println("기혼");
        else
            System.out.println("미혼");
        System.out.println("자녀수:" + childNum);
    }
}

class Order {
    String orderNo;
    String id;
    String orderDate;
    String orderName;
    String productNo;
    String address;

}