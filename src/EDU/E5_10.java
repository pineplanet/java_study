package EDU;
//알파벳과 숫자를 암호표로 암호화 하는 프로그램을 완성해라!
class E5_10 {
    public static void main(String[] args) {
        char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
                ']', '{', '}', ';', ':', ',', '.', '/' };
        // 0     1    2    3    4    5    6    7    8    9
        char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
        String src = "abc123";
        String result = "";
        // 문자열 src 의 문자를 charAt()로 하나씩 읽어서 변환 후 result 에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if ('a'<=ch && ch<='z'){
                result+=abcCode[(int)ch-97];
            }else{
                result+=numCode[(int)ch-48];
            }
        }
        System.out.println("src:" + src);
        System.out.println("result:" + result);
    } // end of main
} // end of class
