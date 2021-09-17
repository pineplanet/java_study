package Exercise;

//if else 말고 switch 문을 써보자
public class Test10 {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A')
            System.out.println("90점 이상");
        else if (grade == 'B')
            System.out.println("80점 이상");
        else if (grade == 'C')
            System.out.println("70점 이상");
        else if (grade == 'D')
            System.out.println("60점 이상");
        else
            System.out.println("60점 미만");
        //동일 변수, 연산자 같음 ==> 스위치로 바꾸자

        System.out.println("===================");
        int score = 0;
        switch (grade) {
            case 'A':
                score = 90;
                System.out.println("90점 이상");
                break;
            case 'B':
                score = 80;
                System.out.println("80점 이상");
                break;
            case 'C':
                score = 70;
                System.out.println("70점 이상");
                break;
            case 'D':
                score = 60;
                System.out.println("60점 이상");
                break;
            default:
                score = 50;
                System.out.println("60점 미만");
                break;
        }
        //switch 문과 if 문의 차이
    }
}
