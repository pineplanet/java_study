package ch04;

public class Calc2test {
    public static void main(String[] args) {
        Calc2 c1 = Calc2.getInstance();
        c1.add(10,20);

        Calc2 c2 = Calc2.getInstance();
        c2.add(30,40);
        System.out.println(c1);
        System.out.println(c2); // 같은 값이 나온다.

    }
}
