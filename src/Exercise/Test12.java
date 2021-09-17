package Exercise;

//랜덤 산수 퀴즈
public class Test12 {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 100);
        int y = (int) (Math.random() * 100);
        int z = (int) (Math.random() * 4) + 1;

        String op = "";
        int result = 0;

/*
        if (z == 1) {
            op = "+";
            result = x + y;
        } else if (z == 2) {
            op = "-";
            result = x - y;

        } else if (z == 3) {
            op = "*";
            result = x * y;

        } else {
            op = "/";
            result = x / y;
        }
*/

        switch (z) {
            case 1:
                op = "+";
                result = x + y;
                break;
            case 2:
                op = "-";
                result = x - y;
                break;
            case 3:
                op = "*";
                result = x * y;
                break;
            case 4:
                op = "/";
                result = x / y;
                break;
        }

        System.out.println(x + op + y + "= ?");

        java.util.Scanner s = new java.util.Scanner(System.in);
        int answer = s.nextInt();
        if (answer == result) {
            System.out.println("정답입니다.");
        } else {
            System.out.println("오답입니다.");
            System.out.println("정답은 " + result);
        }



    }
}
