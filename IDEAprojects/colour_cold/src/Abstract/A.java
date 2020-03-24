package Abstract;

/*  1.如何定义抽象类：在class关键字前加abstract
    2.抽象类无法被实例化————即不能直接创建new抽象类对象
    3.必须用一个子类来继承抽象父类,虽然抽象类没有办法实例化，但是抽象类也有构造方法，该构造方法是给子类创建对象用的
    4.抽象类中可以定义抽象方法：
            抽象方法的语法：在方法的修饰符列表中添加abstract关键字，并且抽象方法应该以";"结束，不能带有"{}"
            例如：public abstract void m1();
    5.抽象类中不一定有抽象方法，但抽象方法必须出现在抽象类中
    6.一个非抽象的类继承抽象类，必须将抽象类中的【所有】抽象方法覆盖，实现，重写。
*/
public abstract class A {
    //Constructor
    A() {
        System.out.println("it is cool");
    }

    public abstract void m();//这段代码会导致B类中报错，因为B继承了A中的全部包括抽象方法m(),
    // 但是抽象方法只能出现在抽象类中而B类不是抽象类所以要在B类中进行重写，覆盖，实现。

    public static void main(String[] args) {
        A a = new B();
    }
}

class B extends A {
    public void m() {
    }

    B() {
        //super()这里默认有个super调用A方法，父类的构造方法虽然调用了，但是没有创建对象
        System.out.println("sure");
    }
}


