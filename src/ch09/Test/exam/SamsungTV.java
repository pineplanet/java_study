package ch09.Test.exam;

public class SamsungTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("SamsungTV -- 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("SamsungTV -- 끈다");
    }

    @Override
    public void soundUp() {
        System.out.println("SamsungTV -- 소리를 올린다");
    }

    @Override
    public void soundDown() {
        System.out.println("SamsungTV -- 소리를 내린다");
    }
}
