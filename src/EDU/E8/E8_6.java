package EDU.E8;

import java.util.Arrays;

class E8_6 {
    public static String fillZero(String src, int length) {
        String result;
        if (src == null || src.length() == length) {
            result = src;
        } else {
            if (length <= 0) {
                result = "";
            }
            else if (src.length() > length) {
                result = src.substring(0,(length));
            } else {
                char[] ch = new char[length];
                Arrays.fill(ch, '0');
                char[] E = src.toCharArray();
                System.arraycopy(E, 0, ch, length - src.length(), src.length());
                result = new String(ch);
            }


        }
        return result;
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }

}
