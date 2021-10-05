package ch09.Test.Test2;

public class Test {
    public static void main(String[] args) {

    }
}

interface Vehicle {
    double load = 1000.0;
    double maxLoad = 5000.0;
    public  double calcFuelEfficiency();
    public  double calcTripDistance();
}

class Truck implements Vehicle{
    //추상 메소드 오버라이딩

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }
}