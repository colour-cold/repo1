package Thread.ThreadTest04;

public class MyThread04 extends Thread {
    public MyThread04() {
    }

    public MyThread04(String name) {
        super(name);//把线程名称传递给父类，让父类(Thread)给子线程起一个名字
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
