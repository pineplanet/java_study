package EDU.E7;

//E7_12: 지역 변수는 접근 제어자를 쓸 수 없다.

/*public class E7_12_13 {
    public static void main(String[] args) {
        private int i = 0;
    }
}*/

//E7_13: Math 클래스의 생성자의 접근 제어자가 Private 인 이유?
//해답: 모든 메소드가 static 메소드이고, 인스턴스 변수가 존재하지 않아서
// 객체를 생성할 필요가 없기 때문이다.