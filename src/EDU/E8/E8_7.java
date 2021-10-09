package EDU.E8;

public class E8_7 {
    public static boolean contains(String src, String target){
        return (-1 !=src.indexOf(target));
    }

    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
