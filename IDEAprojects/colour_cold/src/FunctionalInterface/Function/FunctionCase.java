package FunctionalInterface.Function;

import java.lang.reflect.Array;
import java.util.function.Function;

/*
    使用Function进行函数模型的拼接，按照顺序需要执行的多个函数操作为
        String str = “冷色调，20”；
    1.将字符串截取数字年龄部分，得到字符串
    2.将上一步的字符串转换为int类型的数字
    3.将上一步的int数字加100，得到结果int数字
 */
public class FunctionCase {
    public static void change(String s, Function<String, String[]> fun1, Function<String[], Integer> fun2) {
        fun1.andThen(fun2).apply(s);
    }

    public static void main(String[] args) {
        change("冷色调,20", s -> s.split(","), s -> Integer.parseInt(s[1]) + 100);
    }
}
