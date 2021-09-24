package EDU;
//1+(-2)+3+(-4)... 몇 까지 더해야 총합이 100 이상이 되는가?
public class E4_4 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 0;
        int s = 1;
/*        for (int i =1;sum<100;i++,s=-s){
            num = s*i;
            System.out.println(num);
            sum+=num;
        }*/
        int i = 1;
        while (sum<100){
            num = i *s;
            sum +=num;
            i++;
            s =-s;

        }
        System.out.println(num);
    }
}
