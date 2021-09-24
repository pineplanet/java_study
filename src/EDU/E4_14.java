package EDU;

public class E4_14 {
    public static void main(String[] args) {
        int number = 12344321;
        int tmp = number;
        int result = 0;
        while (tmp !=0){
            result = result*10 + tmp%10;
            tmp /=10;

        }
        if (number == result)
            System.out.println("회문수 입니다");
        else
            System.out.println("회문수가 아닙니다.");
    }
}
