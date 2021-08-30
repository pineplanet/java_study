public class Operator8 {
    public static void main(String[] args) {
        int a = 1_000_000; //100만
        int b = 2_000_000; //200만

        long c = a*b; //a*b가 int 로 계산되서 오버플로우 발생 후 long
        long d = (long)a *b; //1000000L * 2000000 으로 계산 후 long

        System.out.println(c);
        System.out.println(d);
    }
}
