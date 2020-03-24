package Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。(这并不是一个函数式接口->抽象方法不止一个)
    获取一个流非常简单，有以下几种常用的方式：
        所有的Collection集合都可以通过stream默认方法获取流
            default Stream<E> stream()
        Stream接口的静态方法of可以获取数组对应的流
            static<T> Stream<T> of (T...values)
            参数是一个可变参数，那么我们就可以传递一个数组
 */
public class StreamTest03 {
    public static void main(String[] args) {
        //把集合转换为Stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        //将map集合间接转换为Stream流
        //将map集合的key值存储到set集合中
        Map<String, String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream3 = set1.stream();

        //将value值存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //将键值对存储到set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转换为Stream流
        Stream<String> stream6 = Stream.of("1", "2", "3", "4", "5");
        //可变参数可以传递数组
        int[] array = {1, 2, 3, 4, 5};
        Stream<int[]> stream7 = Stream.of(array);


    }
}
