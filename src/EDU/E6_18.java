package EDU;
//int iv와 instanceMethod1을 static 에서 쓰려고 하면 에러가 나는데
//그 이유는 static은 프로그램을 시작 하면서 만들어지고, 나머지는 그 후에 만들어지기 때문
//그래서 static int cv가 iv를 저장하려고 찾아도 아직 생성 전이라 없기 때문이다.
// 오류를 해결하기 위해서는 iv , instanceMethod 1에 static을 붙여 주면 된다.
class MemberCall {
    //int iv = 10;
    static int iv = 10; // 에러 제거
    static int cv = 20;

    int iv2 =cv;
    static int cv2 = iv; //에러 발생
    static void staticMethod1(){
        System.out.println(cv);
        System.out.println(iv); //에러 발생
    }
    static void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv);//에러 발생하지 않음
    }
    static void staticMethod2(){
        staticMethod1();
        instanceMethod1();//에러 발생
    }
    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }


}
