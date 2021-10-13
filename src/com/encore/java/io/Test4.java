package com.encore.java.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Test4 {
    public static void main(String[] args) {
        BufferedInputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream("a.txt"));
            out = new ByteArrayOutputStream();

            byte[] buf = new byte[1024];
            int len = 0;
            while(( len =in.read(buf))!=-1 ){
                out.write(buf,0,len);
            }
            byte[] arr = out.toByteArray();
            String s = new String(arr);
            System.out.println(s);
        } catch (Exception e) {

        }finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }catch (Exception e){

            }
        }
    }
}
