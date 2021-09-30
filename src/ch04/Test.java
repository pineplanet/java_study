package ch04;

import javax.print.attribute.standard.PresentationDirection;

public class Test {
    public static void main(String[] args) {

        //인자 값

        int v1 = 10;
        A a = new A();//new -> heap에 클래스의 멤버변수 생성함
        a.m1(v1);
        System.out.println(v1); //10;

        int[] v2 = {10,20,30};
        a.m2(v2);
        System.out.println(v2[0]);//50으로 변경됨;

        //왜? 기본 데이터 값은 데이터 그대로 복사되지만
        //배열은 주소값이 복사 되니까 m2에서 v2로 접근해서 v2[0]을 변경함

        //리턴값
        int num = a.m3();
        num ++;
        System.out.println(num);

        //매소드에서 생성된 배열

        int[] arr = a.m4();
        for (int n:arr)
            System.out.println(n + " ");

        Person p = new Person();
        a.m5(p);
        System.out.println(p.name+"/"+p.age);

        Person p2 = a.m6();
    }
}

class A{
    public void m1(int v1){
        v1++;
    }
    public void m2(int[] v2){
        v2[0] = 50;
    }
    public int m3(){
        int num = 10;
        return num;
    }
    public int[] m4(){
        int[] arr = {10,20,30};
        return arr; //m4가 끝나도 {10,20,30};는 heap에 계속 남아있음
    }
    public void  m5(Person p){
        p.name = "홍길동";
        p.age   = 23;

    }
    public Person m6(){
        Person p = new Person();
        p.name = "이순신";
        p.age = 58;

        return p;
    }
}