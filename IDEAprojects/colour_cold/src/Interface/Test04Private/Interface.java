package Interface.Test04Private;

/*
    问题描述：
    我们需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题
    但是这个方法不应该让实现类使用，应该是私有化的

    解决方案：
    从java9开始，接口当中允许定义私有方法
    1.普通私有方法，解决多个静态方法之间重复代码问题
    格式：
    private 返回值类型 方法名称(参数列表) {
        方法体
    }
    2.静态私有方法，解决多个静态方法之间重复代码问题
    格式：
    private static 返回值类型 方法名称(参数列表) {
        方法体
    }
 */
public interface Interface {
    public default void method01() {
        System.out.println("默认方法1");
    }

    public default void method02() {
        System.out.println("默认方法2");
    }

    //我不是9所以这边报错了
    //    private default void method3() {
//        System.out.println();
//    }
}
