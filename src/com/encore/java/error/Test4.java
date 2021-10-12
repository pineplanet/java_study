package com.encore.java.error;

public class Test4 {
    public static void main(String[] args) {
        CellPhone c= new CellPhone();
        try {
            c.charge(30);
            c.charge(20);
            c.charge(-10);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

class CellPhone{
    int battery;
    public void charge(int time) throws NegativeNumberException{
        if(time<0){
            time = 0;
            // 오류 발생
            //try {
                throw new NegativeNumberException();
            //} catch (NegativeNumberException e) {
            //    e.printStackTrace();
            //}

        }
        battery+=time;
        System.out.println("배터리량: "+battery);
    }
}