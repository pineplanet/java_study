package ch09.Test.Test3;

public class Test {
    public static void main(String[] args) {
        /*SamsugTV tv = new SamsugTV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
        */

        //고객이 TV를 LG 로 바꿔달라고 요청함
        // 위에 코드 다 엎어야댐, 위에 다 주석 처리

        LgTV tv = new LgTV();
        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
        tv.turnOff();
        // 기존 코드 하나도 못씀 ;
        // 실제 개발 할 때 굉장히 빡치는 상황임
        // 객체 지향 시스템이 아니다.

        // 표준 규약 - > 인터페이스로 만들자


    }
}
