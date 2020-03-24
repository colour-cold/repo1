package Constructor;

public class Test01 {
    //带有static的方法
    public static void method1() {
        //调用doSome
        //完整方式
        Test01.doSome();
        //省略方式
        doSome();

        //调用doOther
        //完整方式
        Test01 t = new Test01();
        t.doOther();
        //省略方式

        //访问i
        //完整方式
        System.out.println(t.i);
        //省略方式

    }

    //没有static的方法
    public void method2() {
        //调用doSome
        //完整方式
        Test01.doSome();
        //省略方式
        doSome();

        //调用doOther
        //完整方式
        this.doOther();
        //省略方式
        doOther();
    }

    //主方法
    public static void main(String[] args) {
        //要求在这里编写程序调用mehtod1
        //完整方式
        Test01.method1();
        //省略方式
        method1();

        //要求在这里编写程序调用method2
        //完整方式
        Test01 t = new Test01();
        t.method2();
        //省略方式
    }

    //没有static的变量
    int i = 10;

    //带有static的方法
    public static void doSome() {
        System.out.println("do some");
    }

    //没有static的方法
    public void doOther() {
        System.out.println("do Other");
    }
}
