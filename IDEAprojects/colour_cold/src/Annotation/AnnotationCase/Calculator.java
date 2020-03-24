package Annotation.AnnotationCase;

import java.util.Arrays;

/*
    自定义一个计算器，其中有很多的方法，我们需要使用注解去检测这些方法
 */
public class Calculator {
    @Check
    public void add() {
        System.out.println("1 + 0 =" + (1 + 0));
    }

    @Check
    public void sub() {
        System.out.println("1 -0 =" + (1 - 0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show() {
        System.out.println("这个方法没有bug");
    }
}
