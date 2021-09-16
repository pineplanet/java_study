package EDU;
//Fahrenheit -> Celcius 변환
// C =  5/9 * (F-32)
// 소숫점 셋째 자리 반올림


public class E3_7 {
    public static void main(String[] args) {
        int fahrenheit= 100;
        //float celcius = ((float)5/9*(fahrenheit-32)*1000)/(float)1000;
        float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5f)/100f;
        System.out.println(celcius);
    }
}
