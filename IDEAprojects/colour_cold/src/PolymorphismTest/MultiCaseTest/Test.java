package PolymorphismTest.MultiCaseTest;

public class Test {
    public static void main(String[] args) {

        Laptop cp = new Laptop();
        cp.powerOn();

        USB mouse = new Mouse();
        cp.useDevice(mouse);

        //正确写法，没有使用多态
        Keyboard keyboard = new Keyboard();
        //方法参数是USB类型，传递进去的是实现类对象
        cp.useDevice(keyboard);//正确写法，也发生了向上转型
        //cp.useDevice(new Keyboard());//也正确

        cp.powerOff();
    }
}
