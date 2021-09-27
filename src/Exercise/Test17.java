package Exercise;

public class Test17 {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            if(i%2==0)
                continue; //짝수는 다음 명령문 스킵

            System.out.println(i);

        }
    }
}
