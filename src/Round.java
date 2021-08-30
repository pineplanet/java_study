import java.awt.*;

public class Round {
    public static void main(String[] args) {
        // long result = Math.round(4.52); 5 저장
        double pi = 3.141592; // double 은 15자리 까지
        double shortPi = Math.round(pi*1000)/1000.0; //round -> 3142/1000.0
        System.out.println(shortPi); // double이니까 3.142
        double shortPi2 = Math.round(pi*1000)/1000;
        System.out.println(shortPi2); //double (int *int)
    }
}
