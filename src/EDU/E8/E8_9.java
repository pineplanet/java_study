package EDU.E8;

public class E8_9 {
    public static String delChar(String src, String delCh){
        StringBuffer str = new StringBuffer() ;
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (delCh.indexOf(ch)==-1)
                str.append(ch);
        }
        return str.toString();


    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)->"+delChar("(1!2@3^4~5)" ,"  ~!@#$%^&*()"));
        System.out.println("(1 2       3  4\t5)->"+delChar("(1 2       3  4\t5)" ,"  ~!@#$%^&*()"));
    }
}
