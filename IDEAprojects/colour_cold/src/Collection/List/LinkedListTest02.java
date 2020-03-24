package Collection.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构：查询慢，增删快
        2.里边包含了大量操作首尾元素的方法
        注解：使用LinkedList集合特有的方法，不能使用多态
        public void addFirst(E e)   将指定元素插入此列表的开头
        public void addLast(E e)    将指定元素添加到此列表的结尾
        public void Push(E e)       将元素推入此列表所表示的堆栈

        public E getFirst()     返回此列表的第一个元素
        public E getLast()      返回此列表的最后一个元素

        public E removeFirst()      移除并返回此列表的第一个元素
        public E removeLast()       移除并返回此列表的最后一个元素
        public E pop()      从此列表所表示的堆栈处弹出一个元素

        public boolean isEmpty()    如果列表不包含元素返回true
 */
public class LinkedListTest02 {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        //使用add方法添加元素
        linked.add("baidu");

        //在列表开头添加www
        linked.addFirst("www");//等效于linked.push("www")
        System.out.println(linked);

        //在列表尾部接入元素com
        linked.addLast("com");
        System.out.println(linked);

        //获取第一个和最后一个元素
        String s1 = linked.getFirst();
        String s2 = linked.getLast();
        System.out.println(s1 + s2);

        //移除第一个与最后一个元素
        System.out.println(linked);
        linked.removeFirst();//相当于linked.pop();
        linked.removeLast();
        System.out.println(linked);

        //清空集合中的元素,添加一个集合是否为空的判断
        if (linked.isEmpty() == false) {
            linked.clear();
        }
        System.out.println(linked);//[]

    }
}
