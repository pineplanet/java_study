public class Operator6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n",a,b, a+b);
        System.out.printf("%d - %d = %d%n",a,b, a-b);
        System.out.printf("%d * %d = %d%n",a,b, a*b);
        System.out.printf("%d / %d = %d%n",a,b, a/b);//소숫점 버림, 반올림 ㄴㄴ
        System.out.printf("%d / %f = %f%n",a,(float)b, a/(float)b);

    }
}
