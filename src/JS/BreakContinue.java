package JS;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        int menu =0, num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴를 선택 하세요(종료:0)");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu==0){
                System.out.println("프로그램 종료");
                break;
            }
            else if (!(1<= menu && menu <= 3)){
                System.out.println("메뉴를 잘못 선택 하셧습니다.(종료는 0)");
                continue;
            }
            System.out.println("선택한 메뉴는 "+menu + "번 입니다.");
        }
    }
}
