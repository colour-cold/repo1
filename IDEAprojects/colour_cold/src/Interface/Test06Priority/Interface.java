package Interface.Test06Priority;

/*
    一个类，如果其直接父类当中的方法与接口当中的默认方法产生了冲突，优先使用父类当中的方法
 */
public interface Interface {
    public default void method01() {
        System.out.println("接口中的默认方法");
    }
}
