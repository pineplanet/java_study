package JS;

public class Exam09 {
    public static void main(String[] args) {
        for (int num = 1; num <=20; num = num+1){
            if (num%2 == 0){
                continue;
            }
            if (num > 10){
                break;
            }
            System.out.println(num);
        }
        System.out.println("반복문 종료");
    }
}
