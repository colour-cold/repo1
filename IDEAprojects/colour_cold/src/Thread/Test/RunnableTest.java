package Thread.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class RunnableTest implements Runnable {
    private int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {

        lock.lock();
        while (ticket > 0) {
            try {
                Thread.sleep(20);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;

        }
        lock.unlock();
    }
}
