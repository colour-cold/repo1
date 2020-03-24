package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    public static <T> void static(List<T> list,Comparator<> super T>)将集合元素按照指定规则排序

    Comparator和Comparable的区别
        Comparable 自己(this)和别人(参数)比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator  相当于找一个第三方的裁判，比较两个

    Comparator的排序规则：
        o1 - o2: 升序
        o2 - o1: 降序
 */
public class CollectionsTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Collections.addAll(list01, 1, 3, 2);
        System.out.println(list01);//1,3,2

        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(list01);//1,2,3

        ArrayList<Student> list02 = new ArrayList<>();
        Student s1 = new Student("冷色调", 21);
        Student s2 = new Student("colour-cold", 18);
        Student s3 = new Student("xdd", 18);

        Collections.addAll(list02, s1, s2, s3);
        System.out.println(list02);//[Student{name='冷色调', age=21}, Student{name='colour-cold', age=18}, Student{name='xdd', age=18}]

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();//升序
            }
        });
        System.out.println(list02);//[Student{name='colour-cold', age=18}, Student{name='xdd', age=18}, Student{name='冷色调', age=21}]


        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();//升序
                //如果两人年龄相同，再使用姓名的第一个字比较
                if (result == 0) {//
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
//        System.out.println(list02);//[Student{name='colour-cold', age=18}, Student{name='xdd', age=18}, Student{name='冷色调', age=21}]
    }
}
