package EDU;
//1+(1+2)+(1+2+3)+(1+2+3+4) ...(1+.....10)
public class E4_3 {
    public static void main(String[] args) {
        int sum = 0;


        for (int i = 1;i<11;i++){
            for (int j = i;j>0;j--){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
