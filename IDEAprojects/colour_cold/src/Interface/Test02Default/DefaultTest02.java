package Interface.Test02Default;

public interface DefaultTest02 {
    public default void method02() {
        System.out.println("在这个接口中创建了一个与DefaultTest01同名的默认方法");
    }
}
