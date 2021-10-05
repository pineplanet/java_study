package ch09.Test.Test2;

public class Test2 {
}

interface Flyer {
    //멤버변수는 public static final
    //메소드는 모두 abstract
    public void takeOff();

    public void land();

    public void fly();

}

class AirPlane implements Flyer {
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Bird extends Animal implements Flyer, interface Vehicle2{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
    public void buildNest(){}
    public void layEggs(){}
}
class Superman implements Flyer{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
    public void leapBuilding(){

    }
    public void stopBullet(){

    }
}

class Animal {
    public void eat(){

    }
}

interface Vehicle2{

}