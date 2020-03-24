package PolymorphismTest.Multi02Field;

/*
    访问成员变量的两种方式：
    1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上找。
    2.间接通过成员方法访问成员变量，看该方法属于谁，优先用谁，没有则向上找。
 */
public class Test {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);//父：10

        //错误写法，因为等号左边为Fu，Fu中无age这一成员变量
//        System.out.println(obj.age);

        System.out.println("==========================");

        //利用成员方法间接访问成员变量
        obj.showNum();//子类未覆盖重写则是父：10
        //子类若是覆盖重写则是子：20
    }
}
