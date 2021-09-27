package EDU;
//거스름돈을 동전으로 바꾸었을 때 몇개의 동전이 필요한지 계산하라
public class E5_6 {
    public static void main(String[] args) {
        //큰 금액 동전을 우선적으로 거슬러줘야한다.
        int[] coinUnit = {500,100,50,10};
        int money = 2680;
        System.out.println("money= "+money);
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
            money = money%coinUnit[i];

        }
    }
}
