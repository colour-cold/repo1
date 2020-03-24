package Interface.Test03Static;

/*
    注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
    正确用法：通过接口名称，直接调用其总的静态方法
    格式：
    接口名称.静态方法名(参数)
 */
public class Test {
    public static void main(String[] args) {
        InterfaceImpl test = new InterfaceImpl();

        //错误写法
        //        test.method01();

        //直接通过接口名称调用静态方法
        Interface.method01();
    }
}
