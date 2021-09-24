package EDU;
//숫자로 이루어진 문자열 각 자리 합 출력
public class E4_8 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for (int i = 0;i<str.length();i++){
            sum +=str.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
