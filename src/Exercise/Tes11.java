package Exercise;

public class Tes11 {
    public static void main(String[] args) {
        System.out.println("층 버튼을 입력하세요");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int button = s.nextInt();
        switch (button){
            case 1:
                System.out.println("약국");
                break;

            case 2:
                System.out.println("정형외과");
                break;
            case 3:
                System.out.println("피부과");
                break;
            case 4:
                System.out.println("치과");
                break;
            case 5:
                System.out.println("헬스 클럽");
                break;
        }
    }


}
