package Thread.ThreadMethod03;

/*
    线程的名称：
        主线程：main
        新线程：Thread-0、Thread-1
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        MyThread03 mt = new MyThread03();
        mt.start();//1.Thread-0 2.Thread[Thread-0,5,main]   Thread-0

        new MyThread03().start();//1.Thread-1   2.Thread[Thread-1,5,main]   Thread-1

        System.out.println(Thread.currentThread().getName());//main
    }
}
