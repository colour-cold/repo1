package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口，里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

    共性的方法：
        public boolean add(E e)     把给定的对象添加到当前集合中
        public void clear()         清空集合中所有的元素
        public boolean remove(E e)  把给定的对象再当前集合中删除
        public boolean contains(E e)判断当前集合中是否包括给定的对象
        public boolean isEmpty()    判断当前集合是否为空
        public int size()           返回集合当中元素的个数
        public Object[] toArray()   把集合中的元素，存储到数组中
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        //创建集合对象，可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[]，重写了toString方法
        /*
            因为返回值boolean一般都返回true，所以可以不用接收
         */
        boolean b1 = coll.add("五五开");
        System.out.println(b1);
        coll.add("卢本伟");
        coll.add("white");
        System.out.println(coll);

        System.out.println("============================");

        /*
            删除元素时，若集合中存在这个元素，删除元素，返回true
                       若集合中不存在此元素，删除失败，返回false
         */
        boolean b2 = coll.remove("white");
        System.out.println(b2);
        boolean b3 = coll.remove("冷色调");
        System.out.println(b3);
        System.out.println(coll);

        System.out.println("============================");

        /*
            包含也是，包含返回true，不包含返回false
         */
        boolean b4 = coll.contains("五五开");
        System.out.println(b4);
        boolean b5 = coll.contains("冷色调");
        System.out.println(b5);

        System.out.println("============================");

        //规则同上
        boolean b6 = coll.isEmpty();
        System.out.println(b6);

        System.out.println("============================");

        //int size()
        int size = coll.size();
        System.out.println(size);

        System.out.println("============================");

        //Object[] toArray()
        Object[] array = coll.toArray();
        System.out.println(Arrays.toString(array));

        System.out.println("============================");

        //clear()请空集合中的所有元素，但是不删除集合，集合还存在
        coll.clear();
        System.out.println(coll);//[]
        System.out.println(coll.isEmpty());//true


    }
}
