package JS;

import java.util.Scanner;

public class TDArray3 {
    public static void main(String[] args) {
        String[][] words = {
                {"Chair","의자"},
                {"Computer","컴퓨터"},
                {"interger","정수"}
        };
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length;i++){
            System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
            String tmp = scanner.nextLine();
            if(tmp.equals(words[i][1])){
                System.out.printf("정답입니다.%n%n");
            }
            else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
            }
        }
    }

}
