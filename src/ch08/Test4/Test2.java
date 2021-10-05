package ch08.Test4;


public class Test2 {
    public static void test(Object obj){

    }
    public static void main(String[] args) {
        B v1 = new C();
        A v2 = new C ();
        Object v3 = new C();
        //C v4 = new A();
        test(v1);

        Salesman s = new Salesman();
        test(s);
        // v3.i -> 에러, v2.j -> 에러
        // 왜? 다형성으로 접근할 수 있는 타입은 선언된 조상 타입 범위
        // 다 접근하고 싶으면 타입을 변경해야함
        ((C)v1).k = 33;
    }
}

class A {
    int i = 10;

}
class B extends A{
    int j =20;
}
class C extends B{
    int k = 30;
}