package Exercise;
//계산기 객체
public class MyCalc {
    public void add (int a, int b){ //덧셈
        int result = a+b;
        System.out.println(result);
    }

    public void add (double a, double b){ //덧셈
        double result = a+b;
        System.out.println(result);
    }
    public void add(int a,int b, int c){ //더하기
        int result = a+b+c;
        System.out.println(result);
    }
    public void mul(){ //곱셈


    }

    public static void main(String[] args) {
       MyCalc c =new MyCalc();
       int result = 50;
       c.add(10,20);
        System.out.println(result);

        c.add(10,20,30);
        c.add(2.5,3.2);

    }


}
