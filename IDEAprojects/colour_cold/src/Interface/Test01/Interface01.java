package Interface.Test01;

/*
    在任何版本的java中，接口都能定义抽象方法。
    格式：
    public abstract 返回值类型 方法名称(参数列表);

    注意事项:
    1.接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
    2.这两个关键字修饰符，可以选择性地省略
 */
public interface Interface01 {
    //这是一个抽象方法
    public abstract void method01();

    //这也是一个抽象方法
    abstract void method02();

    //这也是抽象方法
    public void method03();

    //这还是抽象方法
    void method04();
}
