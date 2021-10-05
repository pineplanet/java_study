package ch09.Test;

public class Test {
    public static void main(String[] args) {

    }
}
//모든 운송수단 객체의 공통 속성 -> 실제 구현 X;
abstract class Vehicle {
    public static double load;
    public static double maxLoad;
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
}

class Truck extends Vehicle{
    @Override
    public double calcFuelEfficiency() {
        return 0.0;
    }

    @Override
    public double calcTripDistance() {
        return 0.0;
    }
}

class RiverBarge extends Vehicle{
    @Override
    public double calcTripDistance() {
        return 0.0;
    }

    @Override
    public double calcFuelEfficiency() {
        return 0.0;
    }
}