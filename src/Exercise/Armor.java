package Exercise;
//pakage ironman.tool.suit; 패키지 계층 구조

//class 선언
//Armor = 멤버

// 접근 제어자 : 접근 범위 설정
// private : 동일 클래스 (class 내에서만 사용)
// 공백 :동일 패키지 (default)
// protected : 동일 패키지 or 상속
// public : 접근 제한 없음

public class Armor { //class body
    //1. 필드 정의
    String name; //필드 , 멤버 변수 heap 메모리
    int height; //변수 타입
    int weight;
    String color;
    boolean isFly;

    //2. 메소드 정의
    //접근 제한자 - 제어자 - 리턴값타입(매개 변수 선언){명령문}
    //메소드 선언 메소드 이름 (argument){}
    void takeOff(){
        System.out.println(name+" 엔진을 구동한다");
        System.out.println("속도를 높인다");
        System.out.println("비행 한다");
    }
    void land(){ }  //아웃풋 타입
    void shootLaser(){ }
    void launchMissile(){ }
    //출력 값 = 리턴 값



}
