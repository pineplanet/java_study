package EDU;

public class 과일바구니 {
    public static void main(String[] args) {
        int numOfApples = 123;
        int sizeOfBucket = 10;

        int numOfBucket = (numOfApples%sizeOfBucket==0)?numOfApples/sizeOfBucket:(numOfApples/sizeOfBucket)+1;
        System.out.println("필요한 바구니 수:"+numOfBucket);
    }
}
