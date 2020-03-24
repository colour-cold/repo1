package Annotation.AnnotationCase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
        Class<Calculator> calculatorClass = Calculator.class;
        Calculator calculator = calculatorClass.newInstance();
        Method[] methods = calculatorClass.getMethods();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Annotation\\AnnotationCase\\bug,txt"));
        int num = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(calculator);
                } catch (InvocationTargetException e) {
                    bw.write(method.getName() + "方法有异常");
                    bw.newLine();
                    bw.write("异常名称是：" + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因为：" + e.getMessage());
                    bw.newLine();
                    bw.write("--------------------------");
                    bw.newLine();
                    num++;
                }
            }
        }
        bw.write("总共有" + num + "个方法出现异常");
        bw.flush();
        bw.close();
    }
}
