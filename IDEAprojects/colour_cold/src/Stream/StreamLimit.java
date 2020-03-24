package Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法limit，用于截取流中的元素
    limit方法可以对流进行截取，只取用前n个
    Stream<T> limit(Long maxSize);
        参数是一个Long类型的值，如果集合当前长度大于参数则进行截取，否则不进行操作
    limit方法是一个延迟方法，只是对该流中的元素进行截取，返回的是一个新的流，所以可以继续调用Stream流中的其他方法
 */
public class StreamLimit {
    public static void main(String[] args) {
        //获取一个Stream流
        String[] array = {"卢本伟", "五五开", "white"};
        Stream<String> stream = Stream.of(array);
        stream.limit(2).forEach(e -> System.out.println(e));
    }
}
