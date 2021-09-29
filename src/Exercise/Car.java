package Exercise;

public class Car {

    String model;
    int speed;


    public void speedUp(int speed){ //속도를 올림
        this.speed += speed; //매개변수 a = 지역변수 //나중에 변수이름은 의미 있는 이름으로 ..
         //안에 speed가 없으면 자동으로 this.가 붙어서 this.speed -> speed 변수가 바뀐다!
    }
    public void speedDown(int a){ //속도를 내림
        speed -=a;

    }//클래스 정의: 자동차 설계도

    public static void main(String[] args) {
        Car c1 = new Car(); // car 인스턴스 만들기 (실물 자동차 만들었다!)
        c1.model = "BMW320";
        c1.speedUp(10);
        c1.speedUp(20);
//        c1.speedDown(10);
        System.out.println(c1.speed);
    }
}
