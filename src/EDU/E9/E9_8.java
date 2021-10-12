package EDU.E9;

import java.util.Scanner;

public class E9_8 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("1과 100 사이 값을 입력하세요 : ");
            try {
                input = new Scanner(System.in).nextInt();
            }catch (Exception e){

                System.out.println("다시 입력하세요");

                continue;
            }

            if (answer > input) {
                System.out.println("더 큰 수를 입력 하세요.");

            } else if (answer < input) {
                System.out.println("더 작은 수를 입력 하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도한 횟수는" + count + " 번 입니다.");
                break;
            }
        }while (true);
    }
}
