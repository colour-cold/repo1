package Interface.Test07Extends;

public interface Interface01 {
    public abstract void method01();

    public abstract void methodCommon();

    public default void method00() {
        System.out.println("1111");
    }
}
