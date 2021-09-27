package Exercise;

public class Test18 {
    public static void main(String[] args) {
        int temp[];
        //== int[] temp;
        //배열의 주소를 갖는 참조 변수 선언

        //배열 생성
        //체크 해야할 것 : 1.type 2.개수
        temp = new int[5];
        char[] arr = new char[3];

        temp[0] = 10;
        arr[0] = 'a';

        System.out.println(temp[0]);
        System.out.println(arr[0]);

        String[] names = new String[4];
        //배열은 생성시 자동 초기화 된다.
        //기본 : 0, 참조 : null

        //System.out.println(temp[2]);
        //System.out.println(arr[2]);
        //System.out.println(names[0]);


        //일반 변수는 에러가 난다!
        //variable age might not have been initialized
        //초기화 1
        int[] arr2 = new int[3];
        arr2[0]=10;
        arr2[1]=20;
        arr2[2]=30;
        //초기화 2
        int[]arr3 = {10,20,30};

        //length
        System.out.println(arr2.length);
        System.out.println(temp.length);

        //배열의 값 출력하기
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
