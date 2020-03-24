package Collection.Set.HashSetTest03;
/*
    HashSet存储自定义类型元素

    Set集合保证元素唯一：
        存储的元素(String、Integer、.....Person)，必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人，视为同一个人，只能存储一次
 */

import java.util.HashSet;

public class HashCodeTest03 {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("大猛男", 18);
        Person p2 = new Person("大猛男", 18);
        Person p3 = new Person("大猛男", 19);

        //因为没有重写hashCode和equals方法所以这两个元素是不同的
//        System.out.println(p1.hashCode());//460141958
//        System.out.println(p2.hashCode());//1163157884
//        System.out.println(p1.equals(p2));//false


        //在Person类中重写后
        System.out.println(p1.hashCode());//709168976
        System.out.println(p2.hashCode());//709168976
        System.out.println(p1.equals(p2));//true

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);

    }
}
