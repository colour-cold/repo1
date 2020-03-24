package FunctionalInterface.Predicate;

import java.util.function.Predicate;

/*

   需求：判断一个字符串长度是否大于5
        1.如果字符串的长度大于5，那返回false
        2.如果字符串的长度不大于5，那么返回true
    所以我们可以使用取反符号 ！对判断的结果进行取反

    Predicate接口中有一个方法negate，表示或者关系，也可以用于连接两个判断条件
    default Predicate<T> negate() {
        return (t) -> !test(t);
    }
 */
public class PredicateTest04 {
    /*
        定义一个方法,方法的参数，传递一个字符串
        使用Predicate接口判断字符串的长度是否大于5
     */
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.negate().test(s);//等价于return !pre.test(s);
    }

    public static void main(String[] args) {
        boolean result = checkString("lcs13s", s -> s.length() > 5);
        System.out.println(result);
    }
}