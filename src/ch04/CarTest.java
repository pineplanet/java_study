package ch04;

public class CarTest {
    public static void main(String[] args) { //code 영역에 Car.count 변수가 생성
        Car c1 = new Car(); //Car 인스턴스 생성됨(Heap),count 는 안만들어짐
        Car c2 = new Car("포르쉐", "red", 500);//Car 인스턴스 생성됨(Heap),count 는 안만들어짐
        Car c3 = new Car();//Car 인스턴스 생성됨(Heap),count 는 안만들어짐


    }
}