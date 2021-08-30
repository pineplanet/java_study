public class Overflow {
    public static void main(String[] args) {
        short sMin = -32768, sMax = 32767; //2^15 -1 +-때문
        char cMin = 0, cMax = 65535; //2^16-1

        System.out.println(sMin);
        System.out.println((short)(sMin-1));
        System.out.println(sMax);
        System.out.println((short)(sMax+1));
        System.out.println((int)cMin);
        System.out.println((int)--cMin);
        System.out.println((int)cMax);
        System.out.println((int)++cMax);

    }

}