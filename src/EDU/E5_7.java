package EDU;

//5-6에서 동전의 갯수를 추가한 프로그램
public class E5_7 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("USAGE: java Exercise5_7 3120");
            System.exit(0);
        }
        //문자열을 숫자로 변환, 입력한 값이 숫자가 아니면 예외 발생
        int money = Integer.parseInt(args[0]);
        System.out.println("money="+money);
        int[] coinUnit = {500,100,50,10};
        int[] coin = {5,5,5,5}; //단위별 동전의 갯수

        for (int i = 0; i < coinUnit.length; i++) {
            int coinNum = 0;
            /*아래 로직에 맞게 코드를 작성 하시오
                    1. 금액을 동전단위로 나눠서 필요한 동전의 갯수를 구한다.
                    2. 배열 coin에서 coinNum만큼 동전을 뺸다.(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다)
                    3. 금액에서 동전의 갯수와 동전 단위를 곱한 값을 뺀다.*/
            coinNum= money/coinUnit[i];
            if( coin[i]>=coinNum){
                coin[i]-=coinNum;
            }else{
                coinNum = coin[i];
                coin[i] = 0;
            }
            money-=coinUnit[i]*coin[i];

            System.out.println(coinUnit[i]+"원:"+coinNum);
        }
        if (money >0){
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("남은 동전의 갯수 =");
        for (int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i]+"원: "+coin[i]);

        }
    }
}
