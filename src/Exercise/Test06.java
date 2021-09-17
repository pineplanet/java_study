package Exercise;
//조건문 : 실행 순서를 조건을 통해 제어 하자!
//if 문
//if (조건식){명령문}
//if (조건식){명령문}else{명령문}
//if (조건식){명령문}else if (조건식){명령문}else{명령문}

public class Test06 {
    public static void main(String[] args) {
        /*System.out.println("1");
        if (10 > 2) {
            System.out.println("2");
        }else {
            System.out.println("3");
        }
        System.out.println("4");*/

        //java.util.Scanner s = new java.util.Scanner(System.in);
        //int score = s.nextInt();
        /*int score = 65;
        //점수가 60점 이상이면 합격 처리를 함, 60점 미만이면 불합격 처리함.
        if (score >= 60) {
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }*/

        //학점 처리, 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D
        //60미만 F
        int score = 50;
        char grade = 'F';
        if (score>=90){
            grade = 'A';
        }else if (score >=80){
            grade = 'B';
        }else if (score >=70){
            grade = 'C';
        }else if (score >=60){
            grade = 'D';
        }
        System.out.println("학점:"+grade);

    }
}
