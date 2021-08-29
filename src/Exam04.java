public class Exam04 {
    public static void main(String[] args) {
        System.out.println(2 <3);
        System.out.println(2>3);

        boolean bMyCheck = (2>3);
        System.out.println(bMyCheck);

        if (1<2)
        {
            System.out.println("hello");

        }
        int num = 3;
        if (num <2)
        {
            System.out.println("Hi~");
        }

        int num2 = 4;
        if ((num2%2)==1)
        {
            System.out.println("나머지가 1이면 출력된다.");
        }
        if ((num2 %2) == 1)
        {
            System.out.println("나머지가 1 : 홀수");

        }
        else
        {
            System.out.println("나머지가 1이 아님, 0 : 짝수");
        }
    }


}
