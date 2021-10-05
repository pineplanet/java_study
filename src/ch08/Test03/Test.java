package ch08.Test03;

public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.info();


    }
}


class A {
    final int MAXVALUE = 100;
    final int i =10;
    public void info(){
    //public final void info(){
        System.out.println("A");
    }
}

class B extends A {
    int j;
    @Override
   public void info(){
        super.info();
        System.out.println("B");
    }
    protected void test(){

    }
}

class C extends B {
    int k;
    @Override
    public void info(){
        super.info();
        System.out.println("C");
    }
    @Override
    protected void test(){

    }
}