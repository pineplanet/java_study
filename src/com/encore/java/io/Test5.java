package com.encore.java.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Test5 {
    public static void main(String[] args) {
        try {
            File dir = new File("/Users/namjh/work");
            System.out.println(dir.isDirectory());
            File dir2 = new File("/Users/namjh/work2");
            dir2.mkdir();

            File file = new File(dir, "file1.txt");
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.exists());

            if (file.exists()) {
                PrintWriter out1 = new PrintWriter(file);
                out1.println("hello java");
                out1.close();

            }
            System.out.println(file.getName());
            System.out.println(file.getPath());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println("파일 크기: " +file.length());

            File subDir = new File("/Users/namjh/work/subDir");
            subDir.mkdir();
            File file2 =  new File(subDir,"file2.txt");
            file2.createNewFile();
            System.out.println(file2.getAbsolutePath());
            System.out.println(file2.getParent());

            File parentDir = file.getParentFile();
            String [] fileNames=   parentDir.list();
            for (String item :
                    fileNames) {
                System.out.println(item);
            }

        } catch (Exception e) {

        }

    }
}
