package Thread.ThreadSafe08;

/*
    实现买票案例
 */
public class RunnableImpl08 implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //设置线程任务：卖票
    @Override
    public void run() {
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
