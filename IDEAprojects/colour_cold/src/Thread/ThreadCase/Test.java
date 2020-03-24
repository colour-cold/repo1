package Thread.ThreadCase;

import java.util.ArrayList;

/*
    测试类：
        包含main方法，程序执行的入口，启动程序
        创建包子对象，创建包子铺线程，创建吃货线程，开启
 */
public class Test {
    public static void main(String[] args) {
        //创建包子对象,可以将创建的包子对象作为锁对象放入同步代码块中使用
        BaoZi bao = new BaoZi("馒头", "肉", false);

        //创建集合存放包子
        ArrayList<String> list = new ArrayList<>();

        //创建包子铺线程
        Thread tMarket = new BaoZiMarket(bao, list);
        //创建吃货线程
        Thread tCustomer = new Customer(bao, list);
        //调用两个线程的start方法
        tMarket.start();
        tCustomer.start();

    }
}
