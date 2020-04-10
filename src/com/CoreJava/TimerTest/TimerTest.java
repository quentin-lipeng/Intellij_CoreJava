package com.CoreJava.TimerTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();

        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleFormatter.parse("2020-4-9 22:16:00");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("执行");
            }
        },date,1000*3);
    }
}
