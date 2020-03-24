package Map;

/*
    JDK9新特性：
        List接口，Set接口，Map接口，里边添加了一个静态方法of，可以给集合一次性添加多个元素
        static <E> List<E> of (E...elements)
        使用前提：
            当集合中存储的元素的个数已经确定了，不再改变时使用

        注意：
            1.of方法只适用于List接口，Set接口，Map接口不适用于接口的实现类
            2.of方法的返回值是一个不能够改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
            3.Set接口，Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 */
public class OfTest07 {
}
