package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
    Stream流中的常用方法filter：用于对Stream流中的数据进行过滤
    Stream<T> filter(Predicate<? super T> predicate);
    filter方法的参数Predicate是一个函数式接口，所以可以传递Lambda表达式，对数据进行过滤
    Predicate中的抽象方法：
        boolean test(T t);
 */
public class StreamFilter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张翠山", "赵敏", "张三丰", "周芷若");
        stream.filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));

        /*
            Stream流属于管道流，只能被消费(使用)一次
            第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
            而这时第一个Stream流已经使用完毕，就会关闭了
            所以第一个Stream流就不能再调用方法了
            IllegalStateException: stream has already been operated upon or closed
         */
        //比如将上面链式编程拆开，由两个流分别执行方法
        Stream<String> stream1 = Stream.of("张无忌", "张翠山", "赵敏", "张三丰", "周芷若");
        Stream<String> stream2 = stream1.filter(name -> name.startsWith("张"));
        stream2.forEach(name -> System.out.println(name));
        //这时再调用stream1执行方法就会在程序运行时报错 IllegalStateException: stream has already been operated upon or closed
        stream1.forEach(name -> System.out.println(name));
    }
}
