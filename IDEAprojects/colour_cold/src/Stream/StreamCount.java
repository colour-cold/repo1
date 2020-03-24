package Stream;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流中的常用方法count：用于统计Stream流中元素的个数
    Long count();
    count方法是一个终结方法，返回值是一个Long类型的整数
    所以不能再继续调用Stream流中的其他方法
 */
public class StreamCount {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        Stream stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
