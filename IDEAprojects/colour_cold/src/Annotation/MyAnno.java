package Annotation;

public @interface MyAnno {
    int value();//这样子AnnotationTest02的@MyAnno会报错，因为没有给value赋值，所以要在那边的@MyAnno后写上(value = 12)

    String value2() default "李狗蛋";//或者直接在定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值

    Person per();

    MyAnno2 anno2();

    String[] strs();//数组

}
