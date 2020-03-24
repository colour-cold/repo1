package IO.Test09.ObjectOutputStream09;

import java.io.Serializable;

/*
    序列化和反序列化的收，会抛出NotSerializableException没有序列化异常
    类通过实现java.io.Serializable接口以启用序列化功能，未实现此接口的类将无法使用其任何状态序列化或反序列化

    Serializable接口也叫标记型接口
        要进行序列化和反序列化的类必须实现Serializable接口，然后会给类添加一个标记
        当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
            有：就可以序列化和反序列化
            没有：就会抛出NotSerializableException异常

    问题：
        每次修改类的定义，都会给class文件生成一个新的序列号
    解决方案：
        无论是否对类的定义进行修改，都不重新生成新的序列号
        可以手动给类添加一个序列号
    格式在Serializable接口规定：
        可序列化类可以通过声明名未"serialVersionUID"的字段(该字段必须时静态(static)、最终(final)的Long类型字段)显示声明其自己的serialVersionUdi：
        static final long serialVersionUID = 42L;常量不可改变
 */
public class Person implements Serializable {
    static final long serialVersionUID = 42L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
