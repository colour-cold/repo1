package Collection.Set;

import java.util.HashSet;

/*
    【前提】：
        存储的元素必须要重写hashCode方法与equals方法
    Set集合在调用add方法的时候，add方法会调用元素的hashCode方法和equals方法判断元素是否重复

    set.add(s1)
    add方法会调用是s1的hashCode()方法，计算字符串"abc"的哈希值，哈希值是【96354】
    在集合中找有没有【96354】这个哈希值的元素，发现【没有】，就会把s1存储到集合中

    set.add(s2)
    add方法会调用是s2的hashCode()方法，计算字符串"abc"的哈希值，哈希值是【96354】
    在集合中找有没有【96354】这个哈希值的元素，发现【有】(存在哈希冲突)，就会调用equals方法和
    哈希值相同的元素进行比较 s2.equals(s1),返回【true】，两个元素哈希值相同，equals方法
    返回true，认定两个元素相同就不会把s2存储到集合中

    set.add("重地")
    add方法会调用是"重地"的hashCode()方法，计算字符串"重地"的哈希值，哈希值是【1179395】
    在集合中找有没有【1179395】这个哈希值的元素，发现【没有】，就会把s1存储到集合中

    set.add("通话")

    add方法会调用是"通话"的hashCode()方法，计算字符串"通话"的哈希值，哈希值是【1179395】
    在集合中找有没有【1179395】这个哈希值的元素，发现【有】(存在哈希冲突)，就会调用equals方法和
    哈希值相同的元素进行比较 s2.equals(s1),返回【false】，两个元素哈希值相同，equals方法
    返回false，认定两个元素不同，就会把"通话"存储到集合中

 */
public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        String s1 = new String("abc");
        String s2 = "abc";
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
        int i1 = s1.hashCode();
        int i2 = s2.hashCode();
        int i3 = "重地".hashCode();
        int i4 = "通话".hashCode();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
