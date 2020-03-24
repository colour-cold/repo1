package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection接口
    List接口的特点：
        1.有序的集合，存储元素和取出元素的顺序是一致的(存储123 取出123)
        2.有索引，包含了一些带索引的方法
        3.允许存储重复元素

    List接口中带索引的方法(特有)
        public void add(int index,E element)    将指定的元素，添加到集合中的指定位置
        public E get(int index)     返回集合中指定位置的元素
        public E remove(int index)      移除列表中指定位置的元素，返回的是被移除的元素
        public E set(int index,E element)       用指定的元素替换集合中指定位置的元素，返回值的更新前的元素

    注意：
        操作索引的时候，一定要防止索引越界异常
        IndexOutOfBoundException索引越界异常集合会报
        ArrayIndexOutOfBoundsException数组索引越界异常
        StringIndexOutOfBoundsException字符串索引越界异常
 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建一个list结合对象，多态
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //在c和d之间加入指定元素"cold"
        list.add(3, "cold");
        System.out.println(list);

        //再把加进去的cold移除
        String remove = list.remove(3);
        System.out.println("移除的是" + remove);
        System.out.println(list);

        //把最后一个a替换为A
        list.set(4, "A");
        System.out.println(list);

        //遍历集合的三种方式
        //1.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println('\n' + "=====================");

        //2.使用迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println('\n' + "=====================");


        //3.使用增强for循环
        for (String s : list) {
            System.out.print(s);
        }
    }
}
