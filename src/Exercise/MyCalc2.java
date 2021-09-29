package Exercise;

public class MyCalc2 {
    public void add(int ...v){ //v = 배열!
        //System.out.println(v.length);
        int sum = 0;
        for(int item:v){
            sum +=item;
        }
        System.out.println("결과값: "+sum);

    }
    public void info(String name,int ...score){
        System.out.print(name);
        for(int s:score)
            System.out.print(s+" ");
        System.out.println();
    }
    public static void main(String[] args) {
       MyCalc2 c = new MyCalc2();
       c.add(10,20);
       c.add(10,20,30);
       c.add(10,20,30,40);
       c.add(10,20,30,40,50);

       c.info("홍길동",90,80,95,60);
       c.info("이순신",80,90,70);

    }
}
