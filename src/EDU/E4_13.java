package EDU;

public class E4_13 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        java.util.Scanner s = new java.util.Scanner(System.in);

        do{
            count++;
            System.out.print("1과 100 사이 값을 입력 하세요 : ");
            input = s.nextInt();

            if(answer > input){
                System.out.println("더 큰 수를 입력 하세요");
            }else if (answer < input ){
                System.out.println("더 작은 수를 입력 하세요 ");
            }else {
                System.out.println("맞췄습니다");
                System.out.println("시도 횟수는 "+count+"번 입니다");
                break;
            }
        }while (true);

    }
}
