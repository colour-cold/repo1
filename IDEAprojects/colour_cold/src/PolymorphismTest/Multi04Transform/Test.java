package PolymorphismTest.Multi04Transform;

import javafx.scene.AmbientLight;

/*
    向上转型，其实就是多态
    向上转型一定是安全的，没有问题的，正确的，但也有一个弊端。
    对象一旦向上转型为父类，那么久无法调用子类原本特有的内容

    向下转型
    格式：子类名称 对象名 = (子类名称) 父类对象;
    含义：将父类对象【还原】成为本来的子类对象

    注意事项：
    1.必须保证对象本来创建的时候，就是猫，才能向下转型成为猫。
    2.如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错。ClassCastException

   */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        //错误写法
//      animal.catchMouse();

        //向下转型，进行【还原】动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的时候是一只猫，现在还原成功是错的，会报ClassCastException
//        Dog dog = (Dog) animal;


    }
}
