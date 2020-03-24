package Stream;

import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        //获取一个String类型的Stream流
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //使用map方法，把字符串类型的整数，转换(映射)为Integer类型的整数
        stream.map(elements -> Integer.parseInt(elements)).forEach(elements -> System.out.println(elements));
    }
}
