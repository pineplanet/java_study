package JS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {
        System.out.println("숫자 하나를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input ==0 ){
            System.out.println("입력하신 숫자는 0 입니다");
        }
        else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");

        }
    }
}
