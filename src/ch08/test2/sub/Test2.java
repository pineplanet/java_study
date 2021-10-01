package ch08.test2.sub;

public class Test2 {
    public static void main(String[] args) {
        C a = new C(77,88,99);
        System.out.println(a.i+":"+a.j+":"+a.k);


    }
}

class A{
    int i = 10;

    public A(int i) {
        //super(); -> 부모 생성자 호출
        this.i = i;
        System.out.println("A() 생성자 호출 됨 ");;
    }
}

class B extends A{
    int j = 20;
    public B(int i, int j) {
        super(i);
        this.j = j;
        System.out.println("B() 생성자 호출 됨 ");;
    }
}

class C extends B {
    int k = 30;
    public C(int i, int j, int k) {
        super(i,j);
        this.k = k;
        System.out.println("C() 생성자 호출 됨 ");;
    }
}
