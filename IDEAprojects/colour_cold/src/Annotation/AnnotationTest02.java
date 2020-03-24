package Annotation;

/*
    自定义注解：
        格式：
            元注解
            public @interface 注解名称{
                属性列表；
            }

        本质：注解本质上就是一个接口，该接口默认继承Annotation接口
            public interface MyAnno extends java.lang.annotation.Annotation {}

        属性：接口中的抽象方法
            要求：
                1.属性的返回值类型
                    a.基本数据类型
                    b.String
                    c.枚举
                    d.注解
                    e.以上类型的数组

                2.定义了属性，在使用时需要给属性赋值
                    1.如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值
                    2.如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可。
                    3.数组赋值时，值使用{}包裹。如果数组中有一个值，则{}省略
 */
public class AnnotationTest02 {
    @MyAnno(value = 12, per = Person.p1, anno2 = @MyAnno2, strs = {"aaa", "bb", "c"})
    public void myMethod01() {

    }

    @MyAnno(value = 12, per = Person.p1, anno2 = @MyAnno2, strs = "abc")
    public void myMethod02() {
    }
}

