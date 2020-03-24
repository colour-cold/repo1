package Stream.StreamCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
     使用Stream流
    需求：
        1.第一个队伍只要名字为3个字的成员姓名并且只要筛选出的前三名
        2.第二个队伍只要姓张的成员筛选最后两人
        3.将两个队伍筛选出的人合并为一个新队伍
        4.根据姓名创建person对象，存储一个新集合，打印
 */
public class StreamCase {
    public static void main(String[] args) {
        //创建队伍1放入流中
        Stream<String> stream1 = Stream.of("迪丽热巴", "宋远桥", "苏星河", "石中玉", "老子", "庄子", "洪七公");
        //使用filter方法筛选名字长度为3的人再用limit方法把取筛选完的流的前3人
        Stream<String> streamA = stream1.filter(name -> name.length() == 3).limit(3);


        //创建集合存放人
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张天爱", "张二狗");
        //姓名为张的人的集合转换为流
        Stream<String> stream2 = list.stream().filter(name -> name.startsWith("张"));
        //获取流中元素个数即姓张有多少人
        long count = stream2.count();
        //再次创建一个姓张的人转换成的流，因为上面的流已经被消费了
        Stream<String> stream = list.stream().filter(name -> name.startsWith("张"));
        //获取最后两人的流
        Stream<String> streamB = stream.filter(name -> name.startsWith("张")).skip(count - 2);
        //合并流
        Stream<String> concat = Stream.concat(streamA, streamB);
        //输出流
        concat.forEach(s -> System.out.println(s));
    }
}
