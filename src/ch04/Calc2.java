package ch04;

public class Calc2 { //싱글톤 패턴
    private static Calc2 calc = new Calc2();

    private Calc2() {

    }

    public static Calc2 getInstance() {
        return calc;
    }

    public int add(int n1, int n2) {
        System.out.println(n1 + n2);
        return n1 + n2;
    }

    public int mul(int n1, int n2) {
        System.out.println(n1 * n2);
        return n1 * n2;
    }

}
