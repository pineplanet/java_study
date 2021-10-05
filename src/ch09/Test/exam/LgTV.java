package ch09.Test.exam;

class LGTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("LGTV -- 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("LGTV -- 끈다");
    }

    @Override
    public void soundUp() {
        System.out.println("LGTV -- 소리를 올린다");
    }

    @Override
    public void soundDown() {
        System.out.println("LGTV -- 소리를 내린다");
    }
}
