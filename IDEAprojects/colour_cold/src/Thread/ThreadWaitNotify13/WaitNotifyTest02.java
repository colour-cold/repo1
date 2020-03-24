package Thread.ThreadWaitNotify13;

/*
   进入到TimeWaiting(计时等待)有两种方式：
        1.使用sleep(Long m)方法，在毫秒值结束后，线程睡醒进入到Runnable/Blocked状态
        2.使用wait(Long m)方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入到Runnable/Blocked状态

   唤醒方法：
        1.void notify() 唤醒在此对象监视器上等待的单个线程
        2.void notifyAll() 唤醒在此对象监视器上等待的所有线程
 */
public class WaitNotifyTest02 {
    public static void main(String[] args) {
  /*      //创建锁对象
        Object obj = new Object();
        //创建顾客线程,让其5s后自动醒
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("告知老板要的包子的种类和数量");
                    //调用wait方法，放弃cpu的执行，进入到WAITING状态(无限等待)
                    try {
                        obj.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子做好了，开吃");
                }
            }
        }.start();*/

        //创建锁对象
        Object obj = new Object();
        //创建顾客1线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客1告知老板要的包子的种类和数量");
                    //调用wait方法，放弃cpu的执行，进入到WAITING状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子做好了，顾客1开吃");
                }
            }
        }.start();

        //创建顾客2线程
        new Thread() {
            @Override
            public void run() {
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("顾客2告知老板要的包子的种类和数量");
                    //调用wait方法，放弃cpu的执行，进入到WAITING状态(无限等待)
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子做好了，顾客2开吃");
                }
            }
        }.start();

        //创建老板线程
        new Thread() {
            @Override
            public void run() {
                //花5秒做包子
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //保证等待和唤醒的线程只能有一个执行，需要使用同步技术
                synchronized (obj) {
                    System.out.println("老板5s后做完了包子，告知顾客开吃");
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
