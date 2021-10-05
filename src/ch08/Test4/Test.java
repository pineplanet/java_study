package ch08.Test4;

import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class Test {

    public static void calcTAX(Employee e) {
        System.out.println("직원의 소득세 계산");
        // 각 직원의 소득세 계산

        //instanceof 연산자
        if (e instanceof Salesman) {
            Salesman s = ((Salesman) e);
            System.out.println("salesman");
            System.out.println(s.annual_sales);
        } else if (e instanceof Consultant) {
            Consultant c = (Consultant) e;
            System.out.println("Consultant");
            System.out.println(c.num_project);
        } else if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Manager");
            System.out.println(m.num_team);

        }
    }

    public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Manager m = new Manager();

        calcTAX(s);
        calcTAX(c);
        calcTAX(m);
        System.out.println(s);
    }
}

class Employee {
    String name;
    int salary;
}

class Salesman extends Employee {
    int annual_sales;
}

class Consultant extends Employee {
    int num_project;
}

class Manager extends Employee {
    int num_team;
}
