package JS;

public class Operator7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 30;
        //byte + byte => int + int (4byte) 인데 byte 로 저장 하려면 에러
        byte c = (byte) (a+b); //그래서 명시적인 형변환이 필요하다.
        System.out.println(c);
        byte d = (byte)(a*b);
        System.out.println(d); //데이터 손실
        int e = (int)(a*b);
        System.out.println(e); //데이터 손실 ㄴㄴ

    }
}
