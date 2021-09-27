package Exercise;

import JS.ForLoop;

public class Test19 {
    public static void main(String[] args) {
        int[] score = {90,85,78,100,98};
        char[] alphabet = {'a','b','c','d'};
        String[] name = {"홍길동","이순신","유관순"};
        int[]  score2;
        score2 = new int[] {90,85,78,100,98};




        //위 3개 배열의 모든 요소를 출력하시오
        for (int i = 0; i < score.length ; i++) {
            System.out.println(score[i]);
        }
        System.out.println();
        for (int i = 0; i < alphabet.length ; i++) {
            System.out.println(alphabet[i]);
        }
        System.out.println();

        for (int i = 0; i < name.length ; i++) {
            System.out.println(name[i]);
        }
        //확장 for 문 for(변수선언: 배열 참조변수)
        for (int num:score2){
            System.out.println(num);
        }
        System.out.println("===========알파벳 처리==============");
        char letter = 'A';
        char []alpha = new char[26];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char)(letter + i);
        }
        for(char c:alpha)
            System.out.println(c);

        System.out.println("===========점수 처리==============");
        //총점, 최고점수, 최저 점수
        int sum = 0;
        int min = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            if (min > score[i])
                    min = score[i];
        }
        System.out.println("총점: "+sum);

        //배열 복사하기
        int[] score3 = score; //90,85,78,100,98
        score3[0] = 88; //88,85,78,100,98
        System.out.println(score[0]); //score의 데이터도 변경됨

        int[]score4 = new int[score.length];
        System.arraycopy(score,0,score4,0,score.length);
    }
}
