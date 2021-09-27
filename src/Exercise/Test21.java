package Exercise;

public class Test21 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int num = 1;
        for (int i = 0; i <arr.length ; i++) { //행반복
            for (int j = 0; j < arr[i].length; j++) { //열반복
                arr[i][j] = num++;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]+" ");

            }
            System.out.println();
        }
        //문제1 배열의 일부분의 합 구하기
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j)
                    sum1 += arr[i][j];
            }

        }
        System.out.println("sum1: " + sum1);
        //문제 2 배열 일부분 합 구하기
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j<=i){
                    System.out.println(arr[i][j]);
                    sum2+=arr[i][j];
                }

            }
            System.out.println();

        }
        System.out.println("sum2 : "+sum2);
    }
}
