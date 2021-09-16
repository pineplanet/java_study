package JS;

public class Random{
    public static void main(String[] args) {
        int num = 0;
        //괄호 {} 안의 내용을 5번 반복
        for (int i = 1; i <= 5; i++){
            num = (int) (Math.random()*6 ) +1;
            System.out.println(num);
        }
    }
}
