package Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.utils.Collections是集合工具类，用来对集合进行操作，部分方法如下：
        public static <T> void sort(List<T> list) {}    将集合中元素按照默认规则排序

    注意：
        sort(List<T> list)使用前提
        被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则：
        自己(this) - 参数：升序
        参数 - 自己(this): 降序
 */
public class CollectionsTest02 {
    public static void main(String[] args) {
        ArrayList list01 = new ArrayList<>();
        ArrayList list02 = new ArrayList<>();

        Collections.addAll(list01, 1, 3, 2);
        Collections.addAll(list02, "a", "c", "b");
        System.out.println(list01);//1,3,2
        System.out.println(list02);//a,c,b


        //调用sort方法排序
        Collections.sort(list01);
        Collections.sort(list02);

        System.out.println(list01);//1,2,3
        System.out.println(list02);//a,b,c

        //创建一个数组存放Person类型 存入三个人
        ArrayList<Person> list03 = new ArrayList<>();
        Person p1 = new Person("卢本伟", 28);
        Person p3 = new Person("冷色调", 18);
        Person p2 = new Person("uzi", 25);
        Collections.addAll(list03, p1, p2, p3);
        System.out.println(list03);//[Person{name='卢本伟', age=28}, Person{name='uzi', age=25}, Person{name='冷色调', age=18}]

//        Collections.sort(list03);//如果不让Person类实现Comparable，并重写compareTo方法就会报错

        //实现并重写后
        Collections.sort(list03);
        System.out.println(list03);//[Person{name='冷色调', age=18}, Person{name='uzi', age=25}, Person{name='卢本伟', age=28}]


    }
}
