package ch08.test2;

public class Test2 {
    public static void main(String[] args) {
        new C();

    }
}
class A{
    int i = 10;

    public A() {
        //super(); -> 부모 생성자 호출
        System.out.println("A() 생성자 호출 됨 ");;
    }
}
class B extends A{
    int j = 20;
    public B() {
        super();
        System.out.println("B() 생성자 호출 됨 ");;
    }
}
class C extends B {
    int k = 30;
    public C() {
        super();
        System.out.println("C() 생성자 호출 됨 ");;
    }
}
