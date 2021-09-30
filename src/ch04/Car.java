package ch04;

public class Car {//제어자 : /접근/final/static
    static int count;//프로그램 시작할때 만들어지고, 끝날 때 사라짐 = 클래스 변수
    String model; // = 인스턴스 생성시마다 만들어짐,  인스턴스 변수
    String color;
    int maxSpeed;

    public Car() {
        this("현대","white",200);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public void test(){
        int speed =10;

    }

}
