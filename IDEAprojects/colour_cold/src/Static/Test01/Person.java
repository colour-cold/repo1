package Static.Test01;
/*
    1.静态不能访问非静态
    2.静态方法中不能用this。
    原因：this代表当前对象，通过谁调用的this，谁就是当前对象。
 */

public class Person {
    int age;//成员变量
    static String name;//静态变量

    public void method() {
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(age);
        //成员方法可以访问静态变量
        System.out.println(name);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法");
        //静态方法可以访问静态变量
        System.out.println(name);
        //静态不能访问非静态【***********重点】
        //System.out.println(age);
    }
}
