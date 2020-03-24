package FunctionalInterface.Consumer;

import java.util.function.Consumer;

/*
    Consumer接口的默认方法andThen
    作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，再对数据进行消费

    例如:
        Consumer<String> con1
        Consumer<String> con2
        String s = "Hello"

        con1.accept(s);//使用con1对s进行消费
        con2.accept(s);//使用con2再对s进行消费
        等同于，连接两个Consumer接口，再进行消费
        con1.andThen(con2).accept(s)

        注意：
            谁在前谁先执行

 */
public class ConsumerTest02 {
    public static void method01(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.accept(s);
        con2.accept(s);
    }

    public static void method02(String s, Consumer<String> con1, Consumer<String> con2) {
        con2.andThen(con1).accept(s);
    }

    public static void main(String[] args) {
        method01("Hello", (t) -> System.out.println(t.toUpperCase()), (x) -> System.out.println(x.toLowerCase()));

        method02("Hello", (t) -> System.out.println(t.toUpperCase()), (x) -> System.out.println(x.toLowerCase()));
    }
}
