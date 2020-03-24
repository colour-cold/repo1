package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
   Class对象功能：
        获取功能：
             获取构造方法们
                Constructor<?>[] getConstructors()
                Constructor<T> getConstructor(类<?>...parameterTypes)

                Constructor<?>[] getDeclaredConstructors()
                Constructor<T> getDeclaredConstructor(类<?>...parameterTypes)

         Constructor：构造方法
            创建对象：
                T newInstance(Object...initargs)

                如果使用空参数构造方法创建对象，操作可以简化：class对象的newInstance方法

            忽略访问权限修饰符的安全检查
               setAccessible(true)：暴力反射
 */
public class ReflectConstructorTest03 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Person的class对象
        Class personClass = Person.class;

        //获取带参构造方法
        Constructor constructor1 = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        Object person1 = constructor1.newInstance("张三", 20);
        System.out.println(person1);


        //获取无参构造方法
        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        Object person2 = constructor2.newInstance();
        System.out.println(person2);
        //可以把空参构造方法创建对象简化为
        Object person3 = personClass.newInstance();
        System.out.println(person3);

        System.out.println("==========================================================================================");

        //获取所有public的构造方法
        Constructor[] constructor3 = personClass.getConstructors();
        for (Constructor constructor : constructor3) {
            System.out.println(constructor);
        }

        System.out.println("-------------------------------------------");

        //获取所有构造方法
        Constructor[] constructors4 = personClass.getDeclaredConstructors();
        for (Constructor constructor : constructors4) {
            System.out.println(constructor);
        }

        System.out.println("--------------------------------------------");

        //获取某个不考虑修饰符的构造方法
        Constructor declaredConstructor1 = personClass.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor1);
        //暴力反射,然后创建对象
        declaredConstructor1.setAccessible(true);
        Object person4 = declaredConstructor1.newInstance("王五");
        System.out.println(person4);

        Constructor declaredConstructor2 = personClass.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor2);
        //暴力反射,然后创建对象
        declaredConstructor2.setAccessible(true);
        Object person5 = declaredConstructor2.newInstance(18);
        System.out.println(person5);
    }
}
