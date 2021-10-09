package com.encore.java.innerclass.test1;

public class Test3 { //생성 + 선언 동시에 하고 싶을 떄
    public static void main(String[] args) {
        Messenger test = new Messenger(){
            @Override
            public String getMessage() {
                return "Test";
            }

            @Override
            public void setMessage(String msg) {
                System.out.println("galaxy에서 메시지 설정: "+msg);
            }
        };
        System.out.println(test.getMessage());
        test.setMessage("galaxy");
    }
}
