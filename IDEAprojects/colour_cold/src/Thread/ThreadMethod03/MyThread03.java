package Thread.ThreadMethod03;

/*
    获取线程的名称：
        1.使用Thread类中的方法getName()
            String getName() 返回该线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
            static Thread currentThread() 返回对当前正在执行的线程对象的引用
 */
public class MyThread03 extends Thread {
    @Override
    public void run() {
        //1.
    /*
        String name = getName();
        System.out.println(name);
    */

        //2.
//        Thread t = currentThread();
//        System.out.println(t);
//        System.out.println(t.getName());

        //链式结构
        System.out.println(currentThread().getName());
    }
}
