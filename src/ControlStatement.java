public class ControlStatement {
    public static void main(String[] args) {
        //int score = 80;

       // if (score > 60){
       //     System.out.println("합격입니다.");
       // }
        int x= 0;
        System.out.printf("x=%d 일때, 참인 것은 %n", x);

        if (x==0) System.out.println("x==0");
        if (x!=0) System.out.println("x!=0");
        if (!(x==0)) System.out.println("!(x==0)");
        if (!(x!=0)) System.out.println("!(x!=0)");

        x = 1;

        System.out.printf("x=%d 일 때, 참인 것은 %n", x);
        if(x==0) System.out.println("x==0");
        if(x!=0) System.out.println("x!=0");
        if(!(x==0)) System.out.println("!(x==0)");
        if(!(x!=0)) System.out.println("!(x!=0)");

    }
}
