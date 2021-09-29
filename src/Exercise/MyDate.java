package Exercise;

public class MyDate {

    private int year;
    private int month;
    private int day;

    //멤버 변수 day의 값을 읽는 기능 : day 값을 리턴하는 메소드
    public int getDay(){
        return day;
    }
    //멤버변수 day 값을 수정하는 기능:
    public void setDay(int day) {
        if (day>32){
            System.out.println("잘못된 값입니다.");
        }else{
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void info(){
        System.out.println(year+"/"+month+"/"+day);
    }

}
