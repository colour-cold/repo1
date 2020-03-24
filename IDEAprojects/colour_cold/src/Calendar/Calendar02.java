package Calendar;
/*
    Calendar类的常用成员方法
        public int get(int field) 返回给定的日历字段的值
        public void set(int field,int value) 将特定的日历字段设置为给定值
        public abstract void add(ing field,int amount) 根据日立的规则，为给定的日历字段添加或减去指定的时间量
        public Date getTime() 返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
    成员方法的参数:
        int field:日历类的字段，可以使用Calendar类的静态成员变量获取
        public static final int YEAR = 1;   年
        public static final int MONTH = 2;  月
        public static final int Date = 5;   月中的某一天
        public static final int DAY_OF_MONTH = 5;   月中的某一天
        public static final int HOUR = 10;  时
        public static final int MINUTE = 12; 分
        public static final int SECOND = 13; 秒

 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar02 {
    public static void main(String[] args) {
        /*
            public int get(int field)：返回给定日历字段的值
            参数：传递指定的日历字段(YEAR,MONTH)
            返回值:日历字段代表的具体值
         */
        //使用getInstance()方法获取Calendar对象
        Calendar c1 = Calendar.getInstance();
        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(c1.get(Calendar.MONTH));//西方的月份0-11，东方的月份1-12
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println(Calendar.getInstance().get(Calendar.DATE));

        System.out.println("=========================");

        /*
            public void set(int field,int value)
            参数：
                int field:传递指定的日历字段(YEAR、MONTH)
                int value:给指定字段设置的值
         */
        Calendar c2 = Calendar.getInstance();
        //设置年为9999
        c2.set(Calendar.YEAR, 9999);
        System.out.println(c2.get(Calendar.YEAR));
        //设置月为9月
        c2.set(Calendar.MONTH, 9);
        System.out.println(c2.get(Calendar.MONTH));
        //设置日为9日
        c2.set(Calendar.DATE, 9);
        System.out.println(c2.get(Calendar.DATE));

        //同时设置年月日，可以使用以下方法为set的重载方法
        c2.set(8888, 8, 8);
        System.out.println(c2.get(Calendar.YEAR));
        System.out.println(c2.get(Calendar.MONTH));
        System.out.println(c2.get(Calendar.DATE));


        System.out.println("========================");

        /*
        public abstract void add(int field,int amount) 根据日历的规则，为给定的日历字段添加或者减去指定的时间量
        参数：
            int field 传递指定的日历字段(YEAR、MONTH)
            int amount 增加减少指定的值
                    正数：增加
                    负数：减少
         */
        Calendar c3 = Calendar.getInstance();
        //把年增加两年
        c3.add(Calendar.YEAR, 2);
        System.out.println(c3.get(Calendar.YEAR));
        //把月份减少三个月
        c3.add(Calendar.MONTH, -3);
        System.out.println(c3.get(Calendar.MONTH));

        System.out.println("=======================");

        /*
            public Date getTime() 返回一个表示此Calendar时间值(从历元到现在的毫秒值偏移量)的Date对象.
            把日历对象转换为日期对象
         */
        Calendar c4 = Calendar.getInstance();
        c4.set(6666, 5, 6);
        Date date = c4.getTime();
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(date));
    }
}
