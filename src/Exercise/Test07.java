package Exercise;
//문제 : temp 변수에 온도가 저장
//온도가 0도보다 높으면 "기체", 그렇지 않으면 "얼음"

//city변수 도시명이 저장, city 변수 값이 서울 이거나 부산이면 "주요도시"로 출력, 그렇지 않으면 "기타 도시"
public class Test07 {
    public static void main(String[] args) {
        //1.
/*        int temp = -65;
        if (temp>0){
            System.out.println("기체");
        }else{
            System.out.println("얼음");
        }*/

        //2.
        String city = "제주도";
        if (city == "서울"||city == "부산"){
            System.out.println("주요도시");
        }else {
            System.out.println("기타도시");
        }
        //string(참조데이터)이므로 상황에 따라서 == 를 쓰면 부정확할 수 있다.
        //city.equals를 사용하는 것이 안정적이다!

        //3. city의 값이 제주도 면 배송료 5000원, 그 외 국내 도시는 2500원 , 해외는 전부 20000원
        String nation = "한국";
        int fee = 2500;
        if (nation.equals("한국")) {
            if (city.equals("제주도")) {
                fee = 5000;
            }

        } else{
            fee = 20000;
            }
        System.out.println("국가: "+nation+" 지역: "+city+" 수수료: "+fee);

        //4. 양수, 음수 , 0 판단
        int number = 12;
        if (number>0){
            System.out.println("양수");
        }else if (number == 0){
            System.out.println("0");
        }else{
            System.out.println("음수");
       }

    }
}
