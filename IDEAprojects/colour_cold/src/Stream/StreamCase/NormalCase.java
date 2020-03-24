package Stream.StreamCase;

//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    使用传统方式，不使用Stream流
    需求：
        1.第一个队伍只要名字为3个字的成员姓名并且只要筛选出的前三名
        2.第二个队伍只要姓张的成员筛选最后两人
        3.将两个队伍筛选出的人合并为一个新队伍
        4.根据姓名创建person对象，存储一个新集合，打印
 */
public class NormalCase {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        Collections.addAll(list1, "迪丽热巴", "宋远桥", "苏星河", "石中玉", "老子", "庄子", "洪七公");
        for (String name : list1) {
            if (name.length() == 3) {
                listA.add(name);
            }
        }
        listB.add(listA.get(0));
        listB.add(listA.get(1));
        listB.add(listA.get(3));

        System.out.println(listB);


        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        ArrayList<String> listD = new ArrayList<>();
        Collections.addAll(list2, "古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张天爱", "张二狗");
        for (String name : list2) {
            if (name.startsWith("张")) {
                listC.add(name);
            }
        }

        listD.add(listC.get(listC.size() - 1));
        listD.add(listC.get(listC.size() - 2));
        System.out.println(listD);

        ArrayList<String> listNew = new ArrayList<>();
        for (String name : listB) {
            listNew.add(name);
        }
        for (String name : listD) {
            listNew.add(name);
        }
        System.out.println(listNew);

        ArrayList<Person> list = new ArrayList<>();
        for (String name : listNew) {
            list.add(new Person(name));
        }
        System.out.println(list);
    }
}
