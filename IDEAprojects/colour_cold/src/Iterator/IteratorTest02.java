package Iterator;

import java.util.ArrayList;

/*
    增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
    Collection<E> extends Iterator<E> 所有的单列集合都可以使用增强for循环
    public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标

    增强for循环：用来遍历集合和数组

    格式：
        for(集合/数组的数据类型  变量名 ：集合名/数组名){
            System.ouy.println(变量名);
        }
 */
public class IteratorTest02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int a : array) {
            System.out.println(a);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("五五开");
        list.add("卢本伟");
        list.add("white");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
