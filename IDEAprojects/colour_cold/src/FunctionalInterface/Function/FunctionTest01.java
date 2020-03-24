package FunctionalInterface.Function;

import java.util.function.Function;

/*
    java.util.function.Function<R t>接口用来根据一个类型的数据的得到另一个类型的数据
        前者称为前置条件，后者成为后置条件
    Function接口中最主要的抽象方法：R apply(T t),根据类型T的参数获取类型R的结果
        使用的场景例如：将String类型转换为Integer类型
 */
public class FunctionTest01 {
    /*
        定义一个方法
        方法的参数传递一个字符串类型的整数
        方法的参数列表传递一个Function接口，泛型使用<String,Integer>
        使用Function接口中的方法apply，把字符串类型的整数，转换为Integer类型的整数
     */
    public static void change(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i + 100);
    }

    public static void main(String[] args) {
        change("123", s -> Integer.parseInt(s));
    }
}
