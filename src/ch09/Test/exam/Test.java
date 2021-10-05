package ch09.Test.exam;
public class Test{
    public static void main(String[] args) {
        //LGTV tv = new LGTV();
        //다형성을 해보자
        //TV tv = new SamsungTV();
        //팩토리 패턴 이용해보자
        BeanFactory factory = new BeanFactory();
        //TV tv = (TV)factory.getBean(args[0]);
        TV tv = (TV)factory.getBean("lg");
        tv.turnOn();
        tv.soundUp();
        tv.soundDown();
        tv.turnOff();
        // 오버라이딩한 메소드가 실행 되니까, 타입변경 안해도 됨
    }
}
