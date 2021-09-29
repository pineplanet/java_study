package Exercise;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate d = new MyDate();
        //System.out.println(d.year);
        //자동 초기화 되서 0이 출력되지롱
        /*int age;
        System.out.println(age);-> 에러가 나지롱 */

        //day 가 잘못됬는데?? 잘못된 데이터 입력(접근)을 막고 싶다!
        //private 사용? == 캡슐화?
        /*d.year = 2021;
        d.month = 9;
        d.day = 35;*/

        d.info();
        d.setDay(25);
        d.info();
    }
}
