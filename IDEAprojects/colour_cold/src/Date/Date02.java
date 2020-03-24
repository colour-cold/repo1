package Date;
/*
    1.Date()的无参构造方法，返回当前时间

    2.Date(Long date)的带参构造方法，返回输入Long类型数值所代表的日期

    3.Long getTime()  把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
      返回自1970年1月1日00：00：00 GMT 以来此Date对象表示的毫秒值。
 */

import java.util.Date;

public class Date02 {
    public static void main(String[] args) {

        //1.Date()的无参构造方法

        //使用创建对象的方法
//        Date date = new Date();
//        System.out.println(date);

        //使用匿名对象方法
        System.out.println(new Date());

        System.out.println("========================");

        //2.Date(Long date)的带参构造方法
        System.out.println(new Date(0L));//Thu Jan 01 08:00:00 CST 1970
        System.out.println(new Date(105641511435L));//Tue May 08 00:51:51 CST 1973

        /*
            3.Long getTime()  把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
                返回自1970年1月1日00：00：00 GMT 以来此Date对象表示的毫秒值。
         */
        Date date = new Date();
        Long time = date.getTime();
        System.out.println(time);

        //或者用匿名对象
        System.out.println(new Date().getTime());
    }
}
