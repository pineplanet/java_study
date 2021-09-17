package Exercise;
//덧셈 퀴즈 만들기
public class Test08 {
    public static void main(String[] args) {
        /*System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        System.out.println((int)(Math.random()*4)+1);*/

        int x = (int)(Math.random()*100);
        int y = (int)(Math.random()*100);
        System.out.println(x+"+"+ y +"= ?");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int answer = s.nextInt();
        int result = x+y;
        if (answer == result){
            System.out.println("정답입니다.");
        }else{
            System.out.println("오답입니다.");
            System.out.println("정답은 "+result);
        }





    }
}
