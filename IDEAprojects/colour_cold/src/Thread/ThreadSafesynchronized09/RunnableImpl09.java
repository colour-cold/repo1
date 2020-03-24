package Thread.ThreadSafesynchronized09;

/*
   卖票案例出现了线程安全问题
   卖出了不存在的票和重复的票

   解决线程安全问题的第一种方案：使用同步代码块
   格式：
    synchronized(锁对象) {
        可能会出现的线程安全问题的代码(访问了共享数据的代码)
    }

    注意：
        1.同步代码块中的锁对象，可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行

    以下代码中同步技术的原理为：
        【使用了一个锁对象，这个锁对象叫同步锁，也叫对象监视器】，3个线程一起抢夺了cpu的执行权，谁抢到了谁执行run方法进行卖票
            假设t0抢到了cpu的执行权，执行run方法，遇到synchronized代码块，这时t0会检查synchronized代码块是否有锁对象
            发现【有，就会获取锁对象，进入同步中执行】

            如果t1也抢到了cpu的执行权，执行run方法，遇到synchronized代码块，这时t1会检查synchronized代码块是否有锁对象
            发现【没有，t1就会进入阻塞状态，会一直等待t0线程归还锁对象，一直到t0线程执行完同步中的代码，会把锁对象归还给同步
            代码块，t1才能获取锁对象进入同步中执行】

    总结：同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步
          同步保证了只能有一个线程在同步中执行共享数据，保证了安全，程序频繁的判断锁，获取锁，释放锁，程序的效果会降低

 */
public class RunnableImpl09 implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    //设置线程任务：卖票
    @Override
    public void run() {

        //同步代码块
        synchronized (obj) {
            while (ticket > 0) {
                //提高安全问题出现概率，让程序睡眠、
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //票存在，卖票ticket--
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
