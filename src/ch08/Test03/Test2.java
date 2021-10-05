package ch08.Test03;

import javax.swing.border.EmptyBorder;

public class Test2 {
    public static void main(String[] args) {
        //Manager m = new Manager();

        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();

        s.calcBonus();
        s.calcSalary();

        c.calcBonus();
        c.calcSalary();

        d.calcBonus();
        d.calcSalary();

    }

}

abstract class Employee {
    String name;
    int salary;

    public abstract void calcSalary();

    public abstract void calcBonus();
}

class Salesman extends Employee {

    @Override
    public void calcSalary() {

        System.out.println("Salesman 급여 = 기본급 + 판매 수당");
    }

    @Override
    public void calcBonus() {
        System.out.println("Director 급여 = 기본급*12*6");
    }
}

abstract class Manager extends Employee {
    @Override
    public void calcSalary() {
        System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
    }


}

class Consultant extends Employee {
    @Override
    public void calcSalary() {

        System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당 ");
    }

    @Override
    public void calcBonus() {
        System.out.println("Director 급여 = 기본급*12*4");
    }
}

class Director extends Manager {
    /*    @Override
        public void calcSalary() {
            System.out.println("Director 급여 = 기본급*12*6");
        }*/
    @Override
    public void calcBonus() {
        System.out.println("Director 급여 = 기본급*12*4");
    }
}