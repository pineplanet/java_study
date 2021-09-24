package EDU;
//int 변수 num 의 각 자리 합 더한 결과 출력
public class E4_9 {
    public static void main(String[] args) {
        int num = 504309;
        int sum =0;
        while (num>0){
            sum = sum+num%10;
            num = num/10;
        }
        System.out.println(sum);
    }
}
