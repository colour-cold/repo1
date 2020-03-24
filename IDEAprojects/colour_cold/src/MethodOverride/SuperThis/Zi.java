package MethodOverride.SuperThis;

/*
    super关键字用来访问父类内容，而this关键字用来访问本类内容。
    this三种用法：
    1.在本类的成员方法中，访问本类的成员变量。
    2.在本类的成员方法中，访问本类的另一个成员方法
    3.在苯类的构造方法中，访问本类的另一个构造方
    (this()调用也必须是构造方法的第一个语句，与super（）一致，
    super和this两种构造调用，不能同时使用)。
    this和super不能同时出现在一个构造函数里面，因为this必然会调用其它的构造函数，其它的构造函数必然也会有super语句的存在.
 */
public class Zi extends Fu {
    int num = 20;

    public Zi() {
        //super() //这一行不再赠送
        this(1, 2);
    }

    public Zi(int n) {
        this();
    }

    public Zi(int n, int m) {
//        this(0); //报错 因为循环了 禁止套娃！！！
    }

    public void method() {
        int num = 10;
        System.out.println(num);//10
        System.out.println(this.num);//20
        System.out.println(super.num);//30
    }

}
