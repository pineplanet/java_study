package EDU;
//실행결과 예측: ABC123
//change의 str은 메인이 아닌 change 의 stack 영역에 올라와있다.
//메소드 호출이 끝난 후 main 영역의 str 은 변하지 않고 여전히 abc123
class E6_19 {
    public static void change(String str){
        str +="456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:"+str);

    }
}
