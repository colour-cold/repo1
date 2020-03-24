package MethodReferrance.MethodReferranceTest04;

public class Dog extends Animal {

    //定义一个方法参数传递SayHello接口
    public void method(SayHello s) {
        s.sayHello();
    }

    public void show() {
        method(() -> {
            //创建父类Animal对象
            Animal a = new Animal();
            //调用父类的sayHi方法
            a.sayHi();
        });

        //因为有子父类关系，所以存在一个关键字super代表父类，所以我们可以直接使用super调用父类成员方法
        //调用method方法，方法的参数SayHello是一个函数式接口，所以可以传递Lambda表达式
        method(() -> super.sayHi());

        /*
            使用super引用类的成员方法
            super已经存在
            父类的成员方法sayHello也是已经存在的
            所以我们可以直接使用super引用父类的成员方法
         */
        method(super::sayHi);
    }

    public static void main(String[] args) {
        new Dog().show();
    }
}
