package com.encore.java.innerclass.test1;

public class Test2 {
    public static void main(String[] args) {
        GalaxyMessenger galaxy = new GalaxyMessenger();
        galaxy.getMessage();
        galaxy.setMessage("Hi");
    }
}

class GalaxyMessenger implements Messenger{

    @Override
    public String getMessage() {
        return "galaxy";
    }

    @Override
    public void setMessage(String msg) {
        System.out.println("galaxy 에서 메시지 설정:"+msg);

    }
}