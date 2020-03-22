package ThreadTest;

/**
 * 通过继承Thread实现线程
 * 但不推荐 因为有局限性
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        MyThread my = new MyThread();

        my.start();

        for (int i=0;i<20;i++){
            System.out.println("主线程" + i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("分支线程" + i);
        }
    }
}
