package Reflect;

import java.lang.reflect.Field;

/*
   Class对象功能：
        获取功能：
            1.获取成员变量们
                Field[] getFields()//获取所有public修饰的成员变量
                Field getField(String name)//获取指定名称的public修饰的成员变量

                Field[] getDeclaredFields()//获取所有的成员变量,不考虑修饰符
                Filed getDeclared(String name)//获取某个不考虑修饰符的指定名称的成员变量

               Filed：成员变量
                    操作：
                        1.设置值
                            void set(Object obj,Object value)
                        2.获取值
                            get(Object obj)
                        3.忽略访问权限修饰符的安全检查
                            setAccessible(true)：暴力反射

 */
public class ReflectFiledTest02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //获取person的class对象
        Class personClass = Person.class;

        System.out.println("1.");

        //获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //获取指定名称的public修饰的成员变量
        Field a = personClass.getField("a");
        System.out.println(a);
        //获取a的值
        Person p = new Person();
        System.out.println(a.get(p));
        //设置a的值
        a.set(p, "张三");
        System.out.println(p);

        System.out.println("=========================================================================================");

        //获取所有成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        //获取某个不考虑修饰符的指定名称的成员变量
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查 -> 暴力反射
        d.setAccessible(true);
        d.get(p);
        d.set(p, "李四");
        System.out.println(p);
    }
}
