package MethodOverride;

public class Zi extends Fu {
    @java.lang.Override
    public void method() {
    }

    public String method1() {
        return null;
        //正确的写法 String为Object子类 所以子类中method1()的返回值类型小于父类
    }

//    public Object method2(){
//        return null;
//    }
    //错误写法子类中method2()的返回值高于父类

//    protected Object method3(){
//        return null;
//    }
    //错误写法，子类方法的权限小于父类方法的权限
}
