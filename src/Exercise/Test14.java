package Exercise;
//반복문
//for, while , do while
    //1.제어 변수 (반복 횟수를 제어할 역할) i = 0
    //2.반복 조건식 ><= true, false
    //3.반복 명령문
    //4.제어 변수 증감식 i ++ , i --

//for(1;2;4){3}
//1 while(2){3,4}
//1 do{3,4}while{2}

public class Test14 {
    public static void main(String[] args) {
        //1. int i = 0;
        //2. i < 5;
        //3. print Hello
        //4. i ++
/*        System.out.println("========for==========");
        for (int i=0;i<10;i=i+2){
            System.out.println("Hello "+i);
        }
        System.out.println("=======while=========");
        int k = 0;
        while(k<3){
            System.out.println("Hello "+k);
            k++;
        }
        System.out.println("=======do while=========");
        int m = 0;
        do{
            System.out.println("Hello "+m);
            m++;
        }while(m<3);*/
        System.out.println("========for==========");
        for (int i = 5 ;i>=0;i--){
            System.out.println(i);
        }
        System.out.println("====================");
        //0 2 4 6 8 10 12 14 ...100
        for (int i = 0; i<=100;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("OK");

        //구구단 2단 출력
        for (int i = 0; i<10;i++){
            System.out.println("2 * "+i +"= "+(i*2));
        }
        //num이 소수 인지 아닌지 판단.
        int num = 5;
        int tmp = 0;
        for (int i = 2; i<=num;i++){
            if(num%i == 0){
                tmp ++;
            }
        }
        if (tmp > 1){
            System.out.println("소수가 아닙니다");
        }else{
            System.out.println("소수 입니다.");
        }


    }
}
