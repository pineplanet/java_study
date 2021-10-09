package EDU.E8;

import java.util.Arrays;
import java.util.Locale;

public class E8_10 {
    public static String format(String str, int length, int alignment) {
        String result = "";
        if (length < str.length()) {
            result = str.substring(0, length);
        } else {
            char[] ch = new char[length];
            Arrays.fill(ch, ' ');
            int idx = 0;
            if (alignment == 1)
                idx = (length / 2) - 1;
            else if (alignment == 2)
                idx = length - str.length();

            for (int i = 0; i < str.length(); i++) {
                ch[idx + i] = str.charAt(i);
            }

            result = String.valueOf(ch);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0));
        System.out.println(format(str, 7, 1));
        System.out.println(format(str, 7, 2));
    }
}
