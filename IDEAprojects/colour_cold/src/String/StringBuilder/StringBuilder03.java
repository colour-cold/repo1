package String.StringBuilder;
/*
    StringBuilder的常用方法:
        public StringBuilder append(...) {} 添加任意类型数据的字符串形式，并返回当前对象自身
 */

public class StringBuilder03 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder sb1 = new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象sb1，this == sb1
//        StringBuilder sb2 = sb1.append("fu*k");
//        System.out.println(sb1);
//        System.out.println(sb2);
//        System.out.println(sb1 == sb2);//true

        //使用append方法无需接收返回值
        sb1.append("abc");
        sb1.append(1);
        sb1.append(true);
        sb1.append(0.56);
        sb1.append('a');
        System.out.println(sb1);

        /*
            链式编程:方法返回值是一个对象，可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        System.out.println(sb1.append("a").append(0.4156).append('牛'));

    }
}
