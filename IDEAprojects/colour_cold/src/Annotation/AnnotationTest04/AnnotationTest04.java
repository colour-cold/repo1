package Annotation.AnnotationTest04;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/*
    在程序使用(解析)注解：获取注解中定义的属性值
        1.获取注解定义的位置的对象(Class,Method,Field)
        2.获取指定的注解
            getAnnotation(Class)
            //其实就是在内存中生成了一个该注解接口的子类实现对象
            public class MyAnnoImpl MyAnno{
                public String className(){
                    retrun "src.AnnotationTest04.MethodClass01";
                }
                public String methodName() {
                    return "show";
                }
            }
         3.调用注解中的抽象方法获取配置的属性值
 */
@MyAnno(className = "Annotation.AnnotationTest04.MethodClass02", methodName = "method02")
public class AnnotationTest04 {
    /*
        前提：不能改变该类的任何代码，可以创建任意类的对象，可以执行任意方法
     */
    public static void main(String[] args) throws Exception {
        //获取该类的字节码文件对象
        Class<AnnotationTest04> annoClass = AnnotationTest04.class;
        //获取上面的注解对象
        MyAnno anno = annoClass.getAnnotation(MyAnno.class);
        //调用注解对象中定义的抽象方法，获取返回值
        String className = anno.className();
        String methodName = anno.methodName();

        Class cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
