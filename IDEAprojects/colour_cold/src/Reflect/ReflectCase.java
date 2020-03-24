package Reflect;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    要求完成一个框架类，在不改动代码的前提下，可以创建任意类的对象，可以执行任意方法
        步骤：
            1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
            2.在程序中加载读取配置文件
            3.使用反射技术来加载文件进内存
            4.创建对象
            5.执行方法
 */
public class ReflectCase {
    public static void main(String[] args) throws Exception {
        //2.在程序中加载读取配置文件
        //创建properties对象
        Properties properties = new Properties();
        //读取配置文件放入集合
        FileInputStream fis = new FileInputStream("src\\Reflect\\pro.properties");
        properties.load(fis);

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);
        Object p = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(p);


    }
}
