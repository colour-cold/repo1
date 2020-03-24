package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符:
        ?：代表任意的数据类型
    使用方式：
        不能创建对象使用
        只能作为方法的参数使用
 */
public class Generic05Test {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(123);
        list1.add(456);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
        list2.add("efg");

        printMethod(list1);
        printMethod(list2);
    }

    /*
       定义一个方法，能遍历所有类型的ArrayList集合
       这时候我们不知道ArrayList集合使用什么数据类型，可以用泛型的通配符?来接收数据类型
       注意：
            泛型没有继承概念，所以不能用ArrayList<Object>
     */
    public static void printMethod(ArrayList<?> list) {
        //增强for循环进行遍历
        for (Object p : list) {
            System.out.println(p);
        }
    }
}
