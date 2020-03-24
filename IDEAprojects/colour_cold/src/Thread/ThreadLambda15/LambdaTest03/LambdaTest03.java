package Thread.ThreadLambda15.LambdaTest03;

import Abstract.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    Lambda表达式有参数有返回值的练习
    需求：
        使用数组存储多个Person对象
        对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 */
public class LambdaTest03 {
    public static void main(String[] args) {

        Person[] array = {
                new Person("lbw", 28),
                new Person("xdd", 18),
                new Person("yjj", 26)
        };

        System.out.println(Arrays.toString(array));//原顺序

        Arrays.sort(array, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(Arrays.toString(array));//从小到大

        Arrays.sort(array, (Person o1, Person o2) -> {
            return o2.getAge() - o1.getAge();
        });

        //Lambda表达式省略优化
        Arrays.sort(array, (o1, o2) -> o2.getAge() - o1.getAge());


        System.out.println(Arrays.toString(array));//从大到小
    }
}
