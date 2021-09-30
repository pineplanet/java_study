package ch04;

public class Student {
    String stdId;
    String name;
    String major;

    public Student(){ //기본 생성자
        this("00000000");
    }
    public Student(String stdId){
        this(stdId,"Anonyous");
    }
    public Student(String stdId,String name){
        this(stdId,name,"미정");
    }
    public Student(String stdId,String name,String major){
        this.stdId = stdId;
        this.name = name;
        this.major = major;
    }

    public void getInfo(){
        System.out.println(this.stdId+":"+this.name+":"+this.major);
    }

    public static void main(String[] args) {
        //입력값이 없는 경우 학번 = "00000000",이름 = "Anonymous",전공 = "미정"
        Student s1 = new Student();
        Student s2 = new Student("20210101");
        Student s3 = new Student("20210102","홍길동");
        Student s4 = new Student("20210103","이순신","컴퓨터 공학");


        s1.getInfo();
        s2.getInfo();
        s3.getInfo();
        s4.getInfo();
    }
}
