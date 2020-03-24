package Interface.Test02Default;

public class Test {
    public static void main(String[] args) {
        DefaultTestImpl test = new DefaultTestImpl();
        test.method01();
        test.method02();//调用默认方法，如果实现类中没有，则会向上找接口

        System.out.println("==============================");

        DefaultTestImpl02 test02 = new DefaultTestImpl02();
        test02.method01();
        test02.method02();
    }
}
