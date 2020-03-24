package Map;

import java.util.*;

/*
    Map集合的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
        Set<K> keySet() 返回此映射中包含的键的Set试图
        Set<K> values() 返回此映射中包含的值的Set试图

    实现步骤：
        1.使用Map集合的方法KeySet()把Map集合中所有的key取出来，存储到一个Set集合中
        2.遍历set集合，获取Map集合中的每一个key
        3.通过Map集合中的方法get(key)通过key找到value

    实现步骤：
        1.使用Map集合的方法values()把Map集合中所有的value取出来，存储到一个Collection集合中
        2.遍历Collection集合，获取Map集合中的每一个value
 */
public class MapTest02 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        //1.使用Map集合的方法keySet()把Map集合中所有的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历set集合，获取Map集合中的每一个key
        //1.迭代
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            //3.通过Map集合中的方法get(key)通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //2.增强for循环
        for (String key : set) {
            //3.通过Map集合中的方法get(key)通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //将set换成map.keySet()也一样
        for (String key : map.keySet()) {
            //3.通过Map集合中的方法get(key)通过key找到value
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("=================================");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        Collection<String> values = map1.values();
        for (String value : values) {
            System.out.print(value);
        }
    }
}
