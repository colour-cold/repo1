package Map;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含两个值(一个key，一个value)
        2.Map集合中的元素，key和Value的数据类型可以相同，也可以不同
        3.Map集合中的元素，key是不允许重复的，value可以重复
        4.Map集合中的元素，key和value是一一对应的

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点：
        1.HashMap集合底层是哈希表，查询的速度特别的快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树(链表长度超过8)：提高查询的速度
        2.HashMap集合是一个无序的集合，存储元素和取出元素顺序有可能不一致

    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMao的特点：
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMao集合是一个有序的集合，存储元素和取出元素的顺序是一致的


 */
public class MapTest01 {
    public static void main(String[] args) {
        /*
            public V put(K key,V value) {} 把指定的键与指定的值添加到Map结合中
                返回值:v
                    存储键值对的时候，key不重复，返回值v是null
                    存储键值对的时候，key重复，会使用新的value替换map中重复的key所对应的value，返回被替换的value值
         */

        //创建Map集合对象，多态
        Map<String, String> map1 = new HashMap<>();

        String v1 = map1.put("卢本伟", "五五开");
        System.out.println(v1);//null

        String v2 = map1.put("卢本伟", "white");
        System.out.println(v2);//五五开

        System.out.println(map1);//{卢本伟=white}

        map1.put("pdd", "嫖老师");
        map1.put("xdd", "天才少年");
        System.out.println(map1);

        System.out.println("======================");

        /*
            public V remove(Object key) 把指定的键所对应的键值对元素在map集合中删除，返回被删除的元素的值
                返回值：V
                    key存在，v返回被删除的值
                    key不存在，v返回null
         */

        //创建Map集合对象
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("冷色调", 180);
        map2.put("xdd", 178);
        map2.put("yjj", 176);
        System.out.println(map2);//{yjj=176, xdd=178, 冷色调=180}

        Integer v3 = map2.remove("冷色调");
        System.out.println(v3);//180

        System.out.println(map2);

//      int v4 = map2.remove("卢本伟");//自动拆箱，会报错，因为int类型不能接收null
        Integer v4 = map2.remove("卢本伟");
        System.out.println(v4);//null

        System.out.println("==================");

        /*
            public V get(Object key) 根据指定的键，在map集合中获取对应的值
                返回值:
                    key存在，返回对应的value值
                    key不存在，返回null
         */

        Integer v5 = map2.get("xdd");
        System.out.println(v5);//178

        Integer v6 = map2.get("卢本伟");
        System.out.println(v6);//null

        System.out.println("=====================");

        /*
            boolean containsKey(Object key)判断集合中是否包含指定的键
            包含返回true
            不包含返回false
         */

        boolean v7 = map2.containsKey("yjj");
        System.out.println(v7);

        boolean v8 = map2.containsKey("卢本伟");
        System.out.println(v8);

    }
}
