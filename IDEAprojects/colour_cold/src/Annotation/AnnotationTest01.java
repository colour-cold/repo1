package Annotation;

/*
    注解：
        概念：说明程序，给计算机看的
              为JDK1.5之后的新特性

        格式：@注解名称

        作用分类：
            1.编写文档：通过代码里表示的注解生成文档【生成文档doc文档】
            2.代码分析：通过代码里表示的注解对代码进行分析【使用反射】
            3.编译检查：通过代码里标识的注解让编译器能够实现基本的编译检查【Override】

        JDK中预定义的一些注解
            @Override：检测被注解标注的方法是否是继承自父类(接口)的
            @Deprecated：该注解标注的内容，表示已过时
            @SuppressWaring：压制警告
                一般传递参数all @SuppressWarnings("all"),当你给一个类注释，那这个类右边就不会有一条条小横线的警告，全被压制了
                                                         当给一个方法用，那么右边不会出现有关这个方法的警告
 */
@SuppressWarnings("all")
public class AnnotationTest01 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01() {
        /*
            假设我们创建了一个新的类show02代替了他
            那我们可以使用注解@Deprecated表示他已过时，这样
            在调用show01方法时就会有横线将他划掉
         */
    }

    public void show02() {
        show01();
    }
}
