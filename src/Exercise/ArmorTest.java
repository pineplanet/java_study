package Exercise;
//객체를 가져다 써보자!
//0.클래스 선언
//1.메모리에 객체를 생성 (new Armor())
//2.인스턴스 사용

public class ArmorTest { //method body
    public static void main(String[] args) {
        int a = 10; //지역변수 stack 메모리
        Armor c = new Armor(); //인스턴스 생성
        Armor d = new Armor();
        //메모리에 Amor 멤버,메소드 공간이 생김
        //클래스: 객체를 프로그래밍 한 것 .
        //인스턴스: 클래스를 프로그램에서 사용하기 위해서 메모리공간에 만들어 놓은것

        c.name = "마크2";
        d.name = "마크16";

        c.takeOff();
        d.takeOff();

    }
}
