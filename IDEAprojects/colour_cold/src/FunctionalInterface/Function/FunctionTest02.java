package FunctionalInterface.Function;

import java.util.function.Function;

/*
   Function接口中的默认方法andThen：用来进行组合操作
   需求：
        把String类型“123”，转换为Integer类型，把转换后的结果加10
        把增加之后的Integer类型的数据，转换为String类型

   分析：
        转换了两次

 */
public class FunctionTest02 {
    public static void change(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        fun1.andThen(fun2).apply(s);
    }

    public static void main(String[] args) {
        change("123", s -> Integer.parseInt(s) + 10, i -> i + "");
    }
}
