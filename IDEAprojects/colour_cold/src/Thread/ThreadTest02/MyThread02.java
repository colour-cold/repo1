package Thread.ThreadTest02;

//1.创建一个Thread类的子类
public class MyThread02 extends Thread {
    //2.在Thread类的子类中重写Thread类中的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run" + i);
        }
    }
}
