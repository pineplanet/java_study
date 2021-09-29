package Exercise;

public class ThisTest {
    int i = 1;
    public void first(){
        int i =2;
        int j =3;
        this.i = i+j; //2+3 -> i를 5로 바꿈
        second(4); //컴파일 하면서 this.second(4);
        //
    }
    public void second(int i){
        int j = 5;
        this.i = i+j;//4+5 -> i는 5에서 9로 바뀜;
    }

    public static void main(String[] args) {
        ThisTest exam = new ThisTest();
        //ThisTest heap메모리에 만들어짐
        exam.first();
        //Stack에 first 영역이 생기면서
        //this라는 변수가 내부적으로 만들어짐
        //현재 실행중인 인스턴스의 주소값이 들어감.
        //i와 j가 stack 영역에 만들어짐
    }
}
