package Interface.Test02Default;

/*
    从java8开始，接口里允许定义默认方法。
    格式：
    public default 返回值类型 方法名称 (参数列表) {
        方法体
    }
    备注：接口当中的默认方法，可以解决接口升级的问题
    注意事项：
    如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
 */
public interface DefaultTest01 {
    //抽象方法
    public abstract void method01();

    //新添加一个抽象方法
    //public abstract void method02();//这时DefaultTestImpl和Test都会报错
    //因为他们没能把此接口中的所有方法重写

    //新添加一个默认方法
    public default void method02() {
        System.out.println("这是新添加的默认方法");
    }
}
