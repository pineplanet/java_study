package Exercise;

public class StudentTest {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();

        a.name = "홍길동";
        b.name = "이순신";
        a.info();
        System.out.println(a.name);
        System.out.println(b.name);


    }
}
