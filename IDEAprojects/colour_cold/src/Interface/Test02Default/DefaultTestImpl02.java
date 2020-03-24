package Interface.Test02Default;

public class DefaultTestImpl02 implements DefaultTest01 {
    @Override
    public void method01() {

    }

    @Override
    public void method02() {
        System.out.println("实现类02覆盖重写了接口的默认方法");
    }
}
