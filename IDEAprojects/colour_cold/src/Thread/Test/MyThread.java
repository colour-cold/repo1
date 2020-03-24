package Thread.Test;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int ticket = 100;
        while (true) {
            for (int i = 0; i < 100; i++) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "第" + ticket + "张票");
        }

    }
}
