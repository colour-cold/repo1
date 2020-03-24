package WrapperClass;
/*
    包装类：
        基本数据类型使用起来很方便，但是没有对应的方法来操作这些基本数据类型的数据
        可以使用一个类，把基本类型的数据装起来，在类中定义一些方法，这个类叫做包装类
        我们可以使用类中的方法来操作这些基本类型的数据

     装箱：把基本类型的数据，包装到包装类中(基本类型的数据->包装类)
        构造方法：
            Integer(int value)  构造一个新分配的Integer对象，它表示指定的int值
            Integer(String s)   构造一个新分配的Integer对象，它表示String参数所指示的int值
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的int值的Integer实例。
            static Integer valueOf(String s) 返回保存指定的String的值的Integer对象。
     拆箱：在包装类中取出基本类型的数据(包装类->基本类型的数据)
        成员方法；
            int intValue() 以 int类型返回该Integer的值
 */

public class IntegerTest01 {
    public static void main(String[] args) {
        //构造方法
        Integer i1 = new Integer(1);
        System.out.println(i1);//1  重写了toString方法

        Integer i2 = new Integer("100");
//      Integer i3 =new Integer("a");//NumberFormatException
        System.out.println(i2);//100

        System.out.println("========================");

        //静态方法
        Integer i3 = Integer.valueOf(1);
        System.out.println(i3);

        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);

        //拆箱
        System.out.println("========================");
        int i5 = i1.intValue();
        System.out.println(i5);

    }
}
