package Generic.Generic04;
/*
    测试含有泛型的接口
 */

public class GenericImplTest {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl01对象
        GenericInterfaceImpl01 gi1 = new GenericInterfaceImpl01();
        gi1.method("字符串");
//        gi1.method(1);报错，泛型在GenericInterfaceImpl01中已经重写方法确认参数为String类型

        System.out.println("========================");

        //创建GenericInterfaceImpl02对象
        GenericInterfaceImpl02<String> gi2 = new GenericInterfaceImpl02<>();
        gi2.method("字符串");

        GenericInterfaceImpl02<Integer> gi3 = new GenericInterfaceImpl02<>();
        gi3.method(123);

    }
}
