package Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
   Class对象功能：
        获取功能：
             3.获取成员方法们
                Method[] getMethod()
                Method getMethod(String name,类<?>...parameterTypes)

                Method[] getDeclaredMethod()
                Method getDeclaredMethod(String name,类<?>...parameterTypes)

        忽略访问权限修饰符的安全检查
                setAccessible(true)：暴力反射

         执行方法：
            Object invoke(Object obj,Object...args)

         获取方法名称：
            String getName()

             4.获取类名
                String getName()
 */
public class ReflectMethodTest04 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //创建Person的class对象
        Class personClass = Person.class;
        //获取public的所有方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        System.out.println("-----------------------------------");

        //获取所有的方法
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

        //获取带参的public方法,并使用
        Method drink_method = personClass.getMethod("drink", String.class);
        Person person = new Person();
        //执行方法
        drink_method.invoke(person, "卢本伟");

        //获取无参public方法，并使用
        Method eat_method = personClass.getMethod("eat");
        eat_method.invoke(person);

        //获取private方法
        Method sleep_method = personClass.getDeclaredMethod("sleep");
        //暴力反射
        sleep_method.setAccessible(true);
        sleep_method.invoke(person);

        System.out.println("=========================================================================================");

        //获取类名
        String className = personClass.getName();
        System.out.println(className);

    }
}
