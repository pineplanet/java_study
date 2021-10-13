package com.encore.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Test6 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("user.properties");
            Properties user = new Properties();
            user.load(fr);

            System.out.println(user.getProperty("id"));
            System.out.println(user.getProperty("password"));
            System.out.println(user.getProperty("name"));

            // properties writing
            FileWriter fw = new FileWriter("car.properties");
            Properties car = new Properties();
            car.setProperty("model","K5");
            car.setProperty("engine","2000");
            car.setProperty("fuel","3.3");

            car.store(fw,"car information");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
