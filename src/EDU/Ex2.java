package EDU;
//양수,음수, 0 을 출력하는 코드 삼항 연산자 2번 사용
public class Ex2 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println((num<0)?"음수":(num==0)?"0":"양수");
    }
}
