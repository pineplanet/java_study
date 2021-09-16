package JS;

public class Comparison {
    public static void main(String[] args) {
        //string 은 클래스 이므로 new를 사용해서 객체를 생성해야 함 (???)
        //String str = new String("abc");
        String str = "abc"; //이것도 허용됨
        //boolean은 기본 자료 형 중 논리형
        boolean result = str.equals("abc"); //문자열 비교는 == 가 아닌 equals를 사용
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\"==\"abc\" ? %b%n","abc" == "abc");
        System.out.printf("str1==\"abc\" ? %b%n",str1 == "abc");
        System.out.printf("str2==\"abc\" ? %b%n",str2 == "abc"); // == 는 서로 다른 객체라 false
        System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
        System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("abc")); //equals 는 내용이 같으면 true
        System.out.printf("str2.equals(\"ABC\") ? %b%n",str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",str2.equalsIgnoreCase("ABC"));

    }
}
