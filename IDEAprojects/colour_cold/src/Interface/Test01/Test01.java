package Interface.Test01;

/*
    接口就是多个类的公告规范
    接口也是一种引用类型，可以等同看作类，最重要的内若就是其中的抽象方法
    1.如何定义接口，语法：public(可省略)【修饰符】 interface 接口名{ 接口内容}
    2.java7版本中，接口中只能出现：
        1.常量
        2.抽象方法
      Java8版本中，还能出现：
        3.默认方法
        4.静态方法
      Java9版本中，还可以出现
        5.私有方法
    3.接口其实是一个特殊的抽象类，特殊在接口是完全抽象的。
    4.接口中没有构造方法，接口也无法被实例化。
    5.接口和接口之间可以多继承。
    6.一个类可以实现多个接口（这里的“实现”可以等同看作继承）
    7.一个非抽象的类实现接口，需要将接口中所有的方法“实现/覆盖/重写”
 */
public class Test01 {

    public interface A {
        //常量 （必须用 public static final修饰）
        public static final String SUCCESS = "success";
        public static final double PI = 3.14;

        //public static final可以省略
        byte MAX_VALUE = 127;//常量

        //抽象方法（接口中所有的抽象方法都是public abstract）
        public abstract void m1();

        //public abstracts是可以省略的
        void m2();
    }

    interface B {
        void m1();
    }

    interface C {
        void m2();
    }

    interface D {
        void m3();
    }

    interface E extends B, C, D {
        void m4();
    }

    //implements是实现的意思，是一个关键字。
    //implements和extends意义相同。
    class MyClass implements B, C {
        public void m1() {
        }

        ;

        public void m2() {
        }

        ;
    }

    class F implements E {
        public void m1() {
        }

        public void m2() {
        }

        public void m3() {
        }

        public void m4() {
        }
    }

}