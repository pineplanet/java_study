package com.encore.java.error;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            //Class.forName("java.test.a");
            int[] arr = new int[3];
            arr[3] = 30; // 오류 발생 - > new AIOB.exception();
            int a = 123 / 0; // 오류 발생 - > new ArithmeticException

            String s = new String("ok");
            int len = s.length();
            s = null;
            //s.length();// 오류 발생  -> new NullPointerException();

            System.out.println("2");
            System.out.println("3");

        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("index 오류 발생");
            System.out.println(e1.getMessage());
        }catch(NullPointerException e2){
            System.out.println("참조 변수 null값 입니다. ");
            System.out.println(e2.getMessage());
        }catch(ArithmeticException e3){
            System.out.println("잘못된 숫자 계산");
            System.out.println(e3.getMessage());
            System.out.println(e3);
            e3.printStackTrace();//오류 시작지점 부터 오류 발생 하기 까지 과정 파악
        }catch(Exception e) {
            System.out.println("기타오류 발생"+e);

        }
        System.out.println("4");
        System.out.println("5");
    }
}
