package com.encore.java.error;

public class NegativeNumberException extends Exception{
    public NegativeNumberException() {
        super("음수는 허용하지 않습니다.");
    }
}
