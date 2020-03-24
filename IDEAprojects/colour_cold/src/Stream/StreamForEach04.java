package Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法foreach
    void foreach(Consumer<? super T> action)
    该方法接受一个Consume接口函数，会将每一个流元素交给该函数进行处理
    Consumer接口是一个消费的函数式接口，可以传递Lambda表达式，消费数据

    简单记：
        foreach方法，用来遍历流中的数据
        是一个终结方法，遍历之后就不能继续调用Stream流中的其他方法
 */
public class StreamForEach04 {
    public static void main(String[] args) {
        //获取一个Stream流
        Stream<String> stream = Stream.of("卢本伟", "五五开", "white");
        //使用Stream流中的方法foreach对Stream流中的数据进行遍历
        stream.forEach(name -> System.out.println(name));
    }
}
