package EDU;

//배열 arr 에 담긴 모든 값을 더하는 프로그램을 완성하시오
public class E5_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum=" + sum);
    }
}
