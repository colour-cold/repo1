package Thread.ThreadInnerClass07;

/*
    匿名内部类方式实现线程的创建

    匿名：没有名字
    内部类：写在其他类内部的类

    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类的子类对象合成一步完成
        把实现类实现接口，重写接口中的方法，创建实现类对象合成一步完成

    格式：
        new 父类/接口() {
            重复父类/接口中的方法
        };
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(111);
                }
            }
        }.start();

        //线程的接口Runnable
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(222);
                }
            }
        };
        Thread t = new Thread(run);
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(333);
                }
            }
        }).start();
    }
}
