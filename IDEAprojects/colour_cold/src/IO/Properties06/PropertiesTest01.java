package IO.Properties06;

import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集，Properties可保存在流中或从流中加载
    Properties 集合是一个唯一和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用

    属性列表中每个键及其对应值都是一个字符串
        Properties集合是一个双列集合，key和value默认都是字符串
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        /*
            使用Properties集合存储数据，遍历取出Properties集合中的数据
            Properties集合是一个双列集合，key和value默认都是字符
            Properties集合有一些操作字符串的特有方法
                Object setProperties(String key,String value)内部其实等于调用Hashtable的方法put
                String getProperties(String key)通过key找到value值，此方法相当于Map集合中的get(key)方法
                Set<String> stringPropertyNames()返回此属性列表中的键集，其中该键及其对应值是字符串，此方法相当于Map集合中的keySet方法
         */
        //创建Properties集合对象
        Properties prop = new Properties();

        //使setProperty往集合中添加数据
        prop.setProperty("五五开", "nb");
        prop.setProperty("卢本伟", "nb");
        prop.setProperty("white", "nb");

        //使用stringPropertyName把Properties集合中的键取出，存储到一个set集合中
        Set<String> set = prop.stringPropertyNames();

        //遍历set集合，取出Properties集合的每一个键
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
