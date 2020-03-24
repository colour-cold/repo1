package Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collection是集合工具类，用来对集合进行操作，部分方法如下：
    public static <T> boolean addALL(Collection<T> c,T...elements)往集合中添加一些元素
    public static void shuffle(List<?> list)打乱顺序，打乱集合顺序
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        /*
            代替了
            list.add(10);
            list.add(20);
            list.add("abc");
            list.add(5.56)
            list.add(true);
         */
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list, 10, 20, "abc", 5.56, true);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
