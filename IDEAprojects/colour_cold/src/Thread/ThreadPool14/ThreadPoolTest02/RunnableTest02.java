package Thread.ThreadPool14.ThreadPoolTest02;

/*
    2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
 */
public class RunnableTest02 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
    }
}
