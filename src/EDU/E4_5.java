package EDU;
//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력

public class E4_5 {
    public static void main(String[] args) {
        for (int i = 1; i<7;i++)
            for (int j = 1; j <7;j++)
                if (i+j == 6)
                    System.out.println(i +" & "+j);
    }


}
