package MethodReferrance.MethodReferranceTest02;

import java.util.ArrayList;

/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的，成员方法也是已经存在的
    就可以使用对象名来引用成员方法
 */
public class Test {
    //定义一个方法，方法的参数传递Printable接口
    public static void printString(String s, Printable p) {
        p.print(s);
    }

    public static void main(String[] args) {
        //调用printString方法，方法的参数Printable是一个函数式接口，所以可以使用Lambda表达式
        printString("Hello", s -> {
            //创建ArrayList集合对象
            ArrayList<String> list = new ArrayList<>();
            //调用ArrayList对象中的成员方法add，把字符串加入数组
            list.add(s);
            System.out.println(list);
        });

        /*
            使用方法引用优化lambda
            对象是已经存在的ArrayList
            成员方法也是已经存在的add
            所以我们可以使用对象名引用成员方法
         */
        //创建ArrayList集合对象
        ArrayList<String> list = new ArrayList<>();
        printString("Hello", list::add);
        System.out.println(list);
    }
}
