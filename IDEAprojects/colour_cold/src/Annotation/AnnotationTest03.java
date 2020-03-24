package Annotation;

/*
    元注解：用于描述注解的注解
        @Target：描述注解能够作用的位置
            格式：@Target{Element.TYPE}
            ElementType取值：
                TYPE：可以作用于类上
                METHOD：可以作用于方法上
                FIELD:可以作用于成员变量上

        @Retention：描述注解被保留的阶段
            @Retention(RetentionPolicy.RUNTIME)：当前被描述的注解，【会被保留到class字节码文件中，并被JVM读取到】
            @Retention(RetentionPolicy.CLASS)：当前被描述的注解，【会被保留到class字节码文件中，但不会被JVM读取到】
            @Retention(RetentionPolicy.SOURCE)：当前被描述的注解，【既不会被保留到class字节码文件中，也不会被JVM读取到】
        @Documented：描述注解是否被抽取到api文档中
        @Inherited：描述注解是否被子类继承

 */
public class AnnotationTest03 {
}
