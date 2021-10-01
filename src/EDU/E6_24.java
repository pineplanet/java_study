package EDU;

public class E6_24 {
    static int abs(int val){
        if (val<0)
            val = -(val);
        return val;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(abs(value));
        value = -10;
        System.out.println(abs(value));
    }
}
