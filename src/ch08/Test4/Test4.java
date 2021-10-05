package ch08.Test4;

import java.util.Objects;

public class Test4 {
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone("SM-F711N");
        Cellphone c2 = new Cellphone("SM-F711N");
        Cellphone c3 = c1;
        Person p = new Person();

        System.out.println(c1.equals(p));

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("=========================");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("=========================");

        if (c1 == c2)
            System.out.println("같다");
        else
            System.out.println("다르다");

        System.out.println(c1.equals(c2));
    }
}

class Cellphone {
    String model;

    Cellphone(String model) {
        this.model = model;
    }
    public String toString(){
        return this.model;
    }

/*    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        //인자값으로 전달된 값이 cellphone 주소값인지 확인
        if(obj instanceof Cellphone){
            if(this.model == ((Cellphone) obj).model){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }*/
    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Cellphone && this.model ==((Cellphone)obj).model)
            result = true;
        return result;
    }

}
class Person{
    //
}