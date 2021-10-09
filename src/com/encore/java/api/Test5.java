package com.encore.java.api;
//Wrapper class
public class Test5{
    public static void main(String[] args) {
        boolean bool = true;
        byte b = 12;
        char c = 'A';
        double d = 3.14;
        float f = 10.5f;
        int i = 123;
        long l = 123456789;
        short s = 256;

        // Boxing
        Boolean obj1 = Boolean.valueOf(bool);
        Byte obj2 = Byte.valueOf(b);
        Character obj3 = Character.valueOf(c);
        Double obj4 = Double.valueOf(d);
        Float obj5 = Float.valueOf(f);
        Integer obj6 = Integer.valueOf(i);
        Long obj7 = Long.valueOf(l);
        Short obj8  = Short.valueOf(s);

        //Unboxing
        boolean bool2 = obj1.booleanValue();
        byte b2 = obj2.byteValue();
        char c2 = obj3.charValue();
        double d2 = obj4.doubleValue();
        float f2 = obj5.floatValue();
        int i2 = obj6.intValue();
        long l2 = obj7.longValue();
        short s2 = obj8.shortValue();

        //auto Boxing

        int n1 = 10;
        Integer obj9 = n1;

        Integer obj10 = new Integer("20");
        int n2 = obj10 + 40;

        //parse
        // String -> 기본 타입

        boolean bool3 = Boolean.parseBoolean("true");
        byte b3 = Byte.parseByte("12");
        double d3 = Double.parseDouble("3.14");
        float f3  = Float.parseFloat("10.5f");
        int i3 = Integer.parseInt("123");


    }
}
