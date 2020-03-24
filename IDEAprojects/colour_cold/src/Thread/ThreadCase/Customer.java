package Thread.ThreadCase;

import java.util.ArrayList;

/*
    消费者(吃货)：是一个线程类，可以继承Thread
        设置线程任务：吃包子
            对包子的状态进行判断
               false没有：
                   吃货调用wait方法进入等待
               true有：
                   吃货吃包子
                   吃完了
                   修改包子的状态为false没有
                   吃货唤醒包子铺线程，生产包子
 */
public class Customer extends Thread {
    //创建包子对象,可以将创建的包子对象作为锁对象放入同步代码块中使用
    BaoZi bao = new BaoZi();


    //创建集合存放做好的包子
    ArrayList<String> list = new ArrayList<>();

    //创建带参构造方法
    public Customer(BaoZi bao, ArrayList<String> list) {
        this.bao = bao;
        this.list = list;
    }

    //设置线程任务
    @Override
    public void run() {
        synchronized (bao) {
            while (true) {
                if (bao.isExistence() == true) {

                    //1s吃一个包子
                    for (String s : list) {
                        System.out.println("吃货吃" + s);
                        try {
                            sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    bao.setExistence(false);

                    System.out.println("吃货吃完了,没包子了，包子铺可以做包子了");

                    bao.notify();

                } else {
                    try {
                        bao.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

