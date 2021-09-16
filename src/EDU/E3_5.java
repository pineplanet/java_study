package EDU;
//num의 1의 자리를 1로 바꾸는 코드
//333 -> 331, 777 -> 771

public class E3_5 {
    public static void main(String[] args) {
        int num = 777;
        System.out.println((num - num%10)+1);

    }
}
