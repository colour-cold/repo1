package Interface.Test07Extends;

/*
    这个子接口当中有4抽象方法
    method01来源于接口01
    method02来源于接口02
    methodCommon同时来源于接口01和02
    method来源于自己
 */
public interface Interface03 extends Interface01, Interface02 {
    public abstract void method();

    @Override
    default void method00() {
    }
}
