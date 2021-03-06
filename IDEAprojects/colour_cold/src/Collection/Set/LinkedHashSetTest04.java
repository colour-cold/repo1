package Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点：
        底层是一个哈希表(数组+链表/红黑树)+链表：多了一条链表(记录元素的存储顺序)，保证元素有序
 */
public class LinkedHashSetTest04 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("colour-cold");
        System.out.println(set);//[colour-cold, abc, www] 无序，不允许重复

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("colour-cold");
        System.out.println(linked);//[www, abc, colour-cold] 有序，不允许重复

    }
}
