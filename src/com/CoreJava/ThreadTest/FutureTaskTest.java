package com.CoreJava.ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 可获得线程的执行结果 是一个泛型类
 * get()当前会阻塞
 */

public class FutureTaskTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        FutureTask<String> futureTask = new FutureTask<>(new Callable() {
//            @Override
//            public Object call() throws Exception {
//                System.out.println("分支线程");
//                Thread.sleep(1000*3);
//                return null;
//            }
//        });
        /**
         * 传lambda实现
         */
        FutureTask<String> futureTask = new FutureTask<>(()-> {
            Thread.sleep(1000*3);
            return "stringBuilder";
        });
        Thread thread = new Thread(futureTask);
        thread.start();
        //get()会造成阻塞 需要等待Callable()执行完 才能完成get()
        String s = futureTask.get();
        System.out.println(s);
    }
}
