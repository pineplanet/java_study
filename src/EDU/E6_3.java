package EDU;

import java.text.DecimalFormat;

public class E6_3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.ban = 1;
        s1.no = 1;
        s1.kor = 100;
        s1.eng = 60;
        s1.math = 76;

        System.out.println(s1.name);
        System.out.println(s1.getTotal());
        System.out.println(s1.getAverage());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public Student() {

    }

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    public String info() {
        return (name + ","
                + ban + ","
                + no + ","
                + kor + ","
                + eng + ","
                + math + ","
                + getTotal() + ","
                + getAverage());
    }
}
