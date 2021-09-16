package JS;

public class C3test2 {
    public static void main(String[] args) {
        int numOfApples = 123; //123
        int sizeOfBucket = 10;
        int numOfBuket = (numOfApples%sizeOfBucket)==0 ? numOfApples/sizeOfBucket: numOfApples/sizeOfBucket+1;
        System.out.println(numOfBuket);
    }
}
