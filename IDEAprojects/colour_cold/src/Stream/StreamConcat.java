package Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法concat：用于把流组合到一起
    如果有两个流，希望合并成为一个流，那么可以使用Stream接口的静态方法concat
    static <T> Stream<T> concat(Stream extends T) a,Stream<? extends T> b)
 */
public class StreamConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream.concat(stream1, stream2).forEach(e -> System.out.println(e));
    }
}
