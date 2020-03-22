package ThreadTest;

/**
 * 通过继承runnable接口
 */

public class ThreadTest01 {
    public static void main(String[] args) {

//        MyThread my = new MyThread();
//        Thread thread = new Thread(my);
//
//        thread.start();

//通过new匿名对象实现
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    System.out.println("分支线程" + i);
                }
            }
        });

        thread1.start();

        for (int i=0;i<20;i++){
            System.out.println("主线程" + i);
        }

    }
}
//通过新建类完成接口实现
//class MyThread implements Runnable {
//
//    @Override
//    public void run() {
//        for (int i=0;i<20;i++){
//            System.out.println("分支线程" + i);
//        }
//    }
//}
