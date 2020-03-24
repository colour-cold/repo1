package FunctionalInterface.FunctionalInterfaceTest01;

public class Test {
    public static void show(MyFunctionalInterface myInter) {
        //定义一个方法，参数使用函数式接口FunctionalInterfaceTest01
        myInter.method01();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //调用show方法，方法的参数是一个接口，所以我们可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method01() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

        //调用show方法，方法的参数是一个函数接口，所以我们可以用lambda表达式
        show(() -> {
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //lambda表达式简化
        show(() -> System.out.println("简化后的lambda表达式重写接口中的抽象方法"));
    }
}
