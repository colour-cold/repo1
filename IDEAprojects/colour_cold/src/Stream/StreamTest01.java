package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    使用传统的方式，遍历集合，对集合中的数据进行过滤
 */
public class StreamTest01 {
    public static void main(String[] args) {
        //创建list集合存储数据
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");


        //遍历输出listA集合中以张开头且长度为3的数据
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张") && s.length() == 3) {
                System.out.println(s);
            }
        }
    }
}

