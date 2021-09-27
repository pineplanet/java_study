package EDU;
//1+(1+2)+(1+2+3)+(1+2+3+4) ...(1+.....10)
public class E4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i =1; i<11; i++){
            sum +=i;
            totalSum += sum;
        }
        System.out.println(totalSum);
    }
}
