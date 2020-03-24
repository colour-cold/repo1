package Stream;

import java.util.ArrayList;
import java.util.List;

/*
    使用Stream流的方式，遍历集合，对集合中的数据进行过滤
    Stream流是JDK1.8之后出现的
    关注的是做什么，而不是怎么做
 */
public class StreamTest02 {
    public static void main(String[] args) {
        //创建list集合存储数据
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合中的元素进行过滤，只要以张开头的元素且字符串长度为3就遍历输出
        list.stream().filter(name -> name.startsWith("张") && name.length() == 3).forEach(name -> System.out.println(name));
    }
}
