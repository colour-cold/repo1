package Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法skip：用于跳过元素
    如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流
    Stream<T> skip(Long n);
        如果流的当前长度大于n，则跳过前n个，否则将会得到一个长度为0的空流
 */
public class StreamSkip {
    public static void main(String[] args) {

        String[] array = {"卢本伟", "五五开", "white"};
        //使用skip方法跳过前2个元素并输出得到的元素
        Stream<String> stream = Stream.of(array);
        stream.skip(2).forEach(e -> System.out.println(e));
    }

}
