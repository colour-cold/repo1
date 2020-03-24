package MethodReferrance.MethodReferranceTest03;

import Thread.ThreadLambda15.LambdaTest04.Calculator;

public class MethodReference {
    //定义一个方法，方法的参数传递要计算绝对值的整数，和函数式接口Calculate
    public static int method(int num, Calculate c) {
        return c.calculate(num);
    }

    public static void main(String[] args) {
        //调用method方法，传递计算绝对值的整数，使用Lambda表达式
        int result = method(-10, num -> Math.abs(num));
        System.out.println(result);

        /*
            使用方法引用优化Lambda表达式
            Math类是存在的
            abs计算绝对值的静态方法也是已经存在的
            所以我们可以直接通过类名引用静态方法
         */
        int result1 = method(-10, Math::abs);
        System.out.println(result1);
    }
}
