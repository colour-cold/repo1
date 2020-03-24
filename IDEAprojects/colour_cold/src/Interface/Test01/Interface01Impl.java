package Interface.Test01;
/*
    接口的使用步骤：
    1.接口不能直接使用，必须有一个【实现类】来【实现】该接口
        格式：
        public 实现类名称 implements 接口名称 {......}
    2.接口的实现类必须覆盖重写(实现)接口中的所有的抽象方法
        实现：去掉abstract关键字，加上方法体大括号
    3.创建实现类的对象，进行使用。

    注意事项：
    如果实现类并没有覆盖重写接口中的所有的抽象方法，那么这个实现类自己就必须是抽象类
 */

public class Interface01Impl implements Interface01 {

    @Override
    public void method01() {
        System.out.println("方法一");
    }

    @Override
    public void method02() {

        System.out.println("方法二");
    }

    @Override
    public void method03() {

        System.out.println("方法三");
    }

    @Override
    public void method04() {

        System.out.println("方法四");
    }
}
