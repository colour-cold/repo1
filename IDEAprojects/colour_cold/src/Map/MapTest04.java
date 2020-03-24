package Map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    HashMap存储自定义类型键值
    Map集合保证是唯一的
        作为key的元素，必须重写hashCode方法和equals方法，保证key唯一
 */
public class MapTest04 {
    public static void main(String[] args) {
        /*
            HashMap存储自定义类型键值
            Key:String类型
                String类型重写hashCode方法和equals方法，可以保证key唯一
            Value：Person类型
                value可以重复(同名同年龄的人视为同一个)
         */
        show01();
    }

    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();

        //往集合中添加元素
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));

        //使用keySet()和增强for循环遍历Map集合
        for (String key : map.keySet()) {
            Person value = map.get(key);
            System.out.println(key + "=" + value);//赵六的key也为北京重复了,所以替换了张三
        }
        System.out.println("===================");

        /*
            HashMap存储自定义类型键值
            key:Person类型
                Person就必须重写hashCode和equals方法，以保证key值唯一
            value：String类型
                可以重复
         */

        //创建HashMap集合
        HashMap<Person, String> map1 = new HashMap<Person, String>();

        //往集合中添加元素
        map1.put(new Person("女王", 18), "英国");
        map1.put(new Person("秦始皇", 18), "秦国");
        map1.put(new Person("普金", 18), "俄罗斯");
        map1.put(new Person("女王", 18), "毛里求斯");

        //使用entrySet()和增强for遍历map1集合
        for (Map.Entry<Person, String> entry : map1.entrySet()) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);//女王重复了所以替换了英国
        }

    }

}
