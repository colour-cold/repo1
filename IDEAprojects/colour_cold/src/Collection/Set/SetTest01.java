package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
    java.util.HashSet集合 implements Set接口
    HashSet特点：
        1.不允许存储重复的元素
        2.没有索引，没有带索引的方法，也不能使用普通for循环遍历
        3.是一个无序的集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构(查询速度非常快)
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //使用add方法往集合中添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println(set);//集合中没有重复的1，也没有按照132顺序输出

        //遍历集合
        //1.迭代器
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println('\n');

        //2.增强for循环
        for (int i : set) {
            System.out.print(i);
        }
    }
}
