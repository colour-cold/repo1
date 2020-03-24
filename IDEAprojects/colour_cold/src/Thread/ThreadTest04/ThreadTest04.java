package Thread.ThreadTest04;

import Thread.ThreadMethod03.MyThread03;

/*
    设置线程的名称:(了解即可)
        1.使用Thread类中的方法setName(名字)
            void setName(String name)改变线程名称，使之与参数name相同
        2.创建一个带参数的构造方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类，让父类(Thread)给子线程起一个名字
            Thread(String name) 分配新的Thread对象
 */
public class ThreadTest04 {
    public static void main(String[] args) {
        MyThread04 mt1 = new MyThread04();
        mt1.setName("伞兵一号");
        mt1.start();

        MyThread04 mt2 = new MyThread04("伞兵二号");
        mt2.start();
    }
}
