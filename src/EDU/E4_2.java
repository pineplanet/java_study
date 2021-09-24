package EDU;

public class E4_2 {
    public static void main(String[] args) {
        //1-20 까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합;
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum = sum + i;

            }

        }
        System.out.println(sum);

    }
}