package ch09.Test.Test3;

public class Test2 {
    public static void main(String[] args) {
       A v = new B();
       v.i = 11;
       //v.j = 22;
        v.info(); // B.info()가 실행됨
        //B info 에서 오버라이딩

    }
}

class A{
    int i = 10;
    public void info(){
        System.out.println("A의 info()");
    }
}

class B extends A{
    int j = 20;
    public void info(){
        System.out.println("B의 info()");
    }
}