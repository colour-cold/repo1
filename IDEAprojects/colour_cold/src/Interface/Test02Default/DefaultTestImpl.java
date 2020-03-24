package Interface.Test02Default;

public class DefaultTestImpl implements DefaultTest01, DefaultTest02 {

    @Override
    public void method01() {

    }

    @Override
    public void method02() {
        System.out.println("对多个接口当中冲突的默认方法进行了重写");//若不重写此在两个接口中都存在的同名冲突方法则会报错
    }

}
