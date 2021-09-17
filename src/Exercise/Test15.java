package Exercise;

public class Test15 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("========구구단 =========");
        for (int i = 2; i < 10; i++) {
            System.out.println(i + " : ");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));

            }
            System.out.println();
        }
        String s = "VILLY BILLY";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.print(c);
        }
        System.out.println();
        System.out.println("===============================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("===============================");
        // 'A' = 65,' B' = 66, 'C' = 67, 'D' = 68, 'E' = 69...
        for(char i = 'A', j= 0 ;i<'E';i++){


        }
    }
}
