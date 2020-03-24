package MethodOverride.SuperThis;
/*   运行后结果: 我是父类无参数构造器
                我是子类无参数构造器
                -------------------
                我是父类无参数构造器
                我是子类有参数构造器

    （1）语句执行的是子类的无参数构造方法，内部默认有super()，代表执行父类无参数构造方法，因此输出父类无参数构造方法中的语句和子类无参数构造方法中的语句；
    （2）语句执行的是子类有参数构造方法，内部也是默认有super()，代表执行父类无参数构造方法，，输出语句是父类无参数构造方法中的语句和子类有参数构造方法中的语句；
若将（3）语句解除屏蔽，则子类有参构造方法中执行super(color,foot)表示执行父类有参构造方法Animal(color,foot)，修改后子类：
        我是父类无参数构造器
        我是子类无参数构造器
        -------------------
        我是父类有参数构造器
        我是子类有参数构造器

 */

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();            //---------------(1)
        System.out.println("-------------------");
        Cat c1 = new Cat("花花", 4);   //----------------(2)
    }
}

class Animal {
    private String color;
    private int foot;

    public Animal() {
        System.out.println("我是父类无参数构造器");
    }

    public Animal(String color, int foot) {
        System.out.println("我是父类有参数构造器");
        this.color = color;
        this.foot = foot;
    }
}

class Cat extends Animal {

    public Cat() {
        super();                    //---------------可以省略
        System.out.println("我是子类无参数构造器");
    }

    public Cat(String color, int foot) {
        super(color, foot);         //---------------(3)
        // super();                     //---------------可以省略
        System.out.println("我是子类有参数构造器");
    }
}

