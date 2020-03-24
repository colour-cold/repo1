package Thread.ThreadCase;

import java.util.ArrayList;

/*
    生产者(包子铺)类：是一个线程类，可以继承Thread
        设置线程任务：生产包子
               对包子的状态进行判断
               true有：
                   包子铺调用wait方法进入等待状态
               false没有：
                   包子铺生产包子
                   增加一些趣味性：交替生产两种包子
                         有两种状态(i%2==0)
                                  (i%2==1)
                    包子铺生产好了包子
                    修改包子的状态为true有
                    唤醒吃货线程，让吃货线程吃包子
 */
public class BaoZiMarket extends Thread {
    //创建包子对象,可以将创建的包子对象作为锁对象放入同步代码块中使用
    BaoZi bao = new BaoZi();

    //创建集合存放做好的包子
    ArrayList<String> list = new ArrayList<>();

    //创建带参构造方法
    public BaoZiMarket(BaoZi bao, ArrayList list) {
        this.bao = bao;
        this.list = list;
    }


    //设置线程任务
    @Override
    public void run() {
        synchronized (bao) {
            while (true) {

                if (bao.isExistence() == true) {
                    try {
                        bao.wait();//包子铺调用wait方法进入等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("包子铺开始生产包子");

                    //1s做一个包子
                    for (int i = 0; i < 5; i++) {
                        if (i % 2 == 0) {
                            String name = bao.getS1();
                            System.out.println("生产了" + name);
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            list.add(name);
                        }
                        if (i % 2 == 1) {
                            String name = bao.getS2() + bao.getS1();
                            System.out.println("生产了" + name);
                            try {
                                sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            list.add(name);
                        }
                    }
                    bao.setExistence(true);
                    //唤醒吃货线程
                    System.out.println("包子做完了，吃货可以吃了");
                    bao.notify();
                }
            }
        }
    }
}
