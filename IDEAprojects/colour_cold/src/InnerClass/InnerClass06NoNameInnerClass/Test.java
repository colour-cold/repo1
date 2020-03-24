package InnerClass.InnerClass06NoNameInnerClass;

/*
    如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
    那么这种情况下就可以省略该类的定义，而改为使用【匿名内部类】.

    匿名内部类的定义格式:
    接口名称 对象名 = new 接口名称() {
        //覆盖重写所有的抽象方法
    };

    对格式"new 接口名称() {...}"进行解析；
    1.new代表创建对象的动作
    2.接口名称就是匿名内部类需要实现哪个接口
    3.{...}这才是匿名内部类的内容

    另外还要注意几点问题:
    1.匿名内部类，在【创建对象】的时候，只能使用唯一一次。
    如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
    2.匿名对象，在【调用方法】的时候，只能调用唯一一次
    如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
    3.匿名内部类是省略了【实现类/子类】名称，但匿名对象是省略了【对象名称】
    强调：匿名内部类和匿名对象不是一回事
 */
public class Test {
    public static void main(String[] args) {
        InterfaceImpl test1 = new InterfaceImpl();
        test1.method01();//实现类重写了接口中的抽象方法-111
        System.out.println("===========================");

        //错误写法
//        Interface test2 = new Interface();

        //使用了匿名内部类，但不是匿名对象，对象名称就叫test2
        Interface test2 = new Interface() {
            @Override
            public void method01() {
                System.out.println("匿名内部类实现了接口抽象方法-111A");
            }

            @Override
            public void method02() {
                System.out.println("匿名内部类实现了接口抽象方法-222A");
            }

        };
        test2.method01();//匿名内部类实现了方法-111
        test2.method02();//匿名内部类实现了方法-222
        System.out.println("==========================");

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new Interface() {
            @Override
            public void method01() {
                System.out.println("匿名内部类实现了接口抽象方法-111B");
            }

            @Override
            public void method02() {
                System.out.println("匿名内部类实现了接口抽象方法-222B");
            }
        }.method01();//"匿名内部类实现了接口抽象方法-111B"

    }

}
