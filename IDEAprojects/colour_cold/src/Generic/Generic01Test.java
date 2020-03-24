package Generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型是一种未知的数据类型，当我们不知道使用什么数据类型的时候，可以使用泛型
    泛型也可以看成是一个变量，用来接受数据类型
        E e：Element 元素
        T t：Type    类型
 */
public class Generic01Test {
    public static void main(String[] args) {
        /*
            创建集合对象，不使用泛型
            好处：
                集合不使用泛型，默认的类型就是object类型，可以存储任意类型的数据
            弊端：
                不安全，会引发异常
     */
        ArrayList list1 = new ArrayList();
        list1.add("abc");
        list1.add(1);

        //获取迭代器
        Iterator it1 = list1.iterator();

        //遍历集合
        while (it1.hasNext()) {
            Object obj = it1.next();
            System.out.println(obj);


            //想要使用String类特有的方法，length获取字符串的长度，不能使用因为是创建时使用的是多态
            //Object obj = "abc"无法使用子类特有的方法,需要向下转型
            String s = (String) obj;
            System.out.println(s.length());//这时会抛出ClassException类型转换异常，不能把Integer 1类型转换为String类型
        }

        System.out.println("=========================");

        /*
            创建集合对象，使用泛型
            好处：
                1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
                2.把运行期异常(代码运行之后会抛出的异常)，提升到了编译期(写代码的时候会报错)
            弊端：
                泛型是什么类型，只能存储什么类型的数据
         */

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("abc");
//        list2.add(1); //报错

        //使用迭代器遍历集合
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = it2.next();
            System.out.println(str + str.length());
        }
    }
}
