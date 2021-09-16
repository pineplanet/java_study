package JS;

public class Exam06 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i = i+1){

            System.out.print(2*i + " ");

        }
        System.out.println();
        System.out.println("======");

        for (int i=2; i<10; i=i+1){
            System.out.print(i+"단:");
            for (int j = 2; j < 10 ; j = j+1){
                System.out.print(j*i+" ");
            }
            System.out.println();

        }



    }
}
