package Interface.Test07Extends;

public interface Interface02 {
    public abstract void method02();

    public abstract void methodCommon();

    public default void method00() {
        System.out.println("2222");
    }
}
