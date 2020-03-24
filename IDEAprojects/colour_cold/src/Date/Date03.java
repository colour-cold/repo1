package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat 是日期/时间格式化子类的抽象类
    作用:
        格式化（也就是日期--> 文本）、解析(文本 --> 日期)
    成员方法:
        public String format(Date date)  按照指定的模式，把Date日期，格式化为符合模式的字符串
        public Date parse(String source)   把符合模式的字符串，解析为Date日期
    DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类

    构造方法：
        SimpleDateFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
      参数:
        String pattern 传递指定的模式
      模式：区分大小写
        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒
    写对应的模式，会把模式替换为对应的日期和时间
        yyyy-MM-dd HH:mm:ss(此格式为format方法默认格式)
    注意：模式中的字母不能随意更改，连接模式的符号可以改变
    如：yyyy年MM月dd日 HH:mm:ss
 */
public class Date03 {
    public static void main(String[] args) throws ParseException {
        //格式化
        //1.创建对象，传递指定模式"yyyy年MM月dd日 HH:mm:ss"
        SimpleDateFormat sdf = new SimpleDateFormat();
        //2.调用format方法，按照所传模式把Date日期格式化为符合格式的字符串
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(d);//2020-02-18 21:49:16
        System.out.println(date);//Tue Feb 18 21:49:16 CST 2020


        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //使用匿名对象
        System.out.println(sdf1.format(new Date()));//2020年02月18日 21:49:16

        System.out.println("======================================");

        //解析
        //1.创建对象，传递指定模式
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //2.调用parse方法把符合模式的字符串解析为Date日期,由于parse方法会申明异常，所以解决一下抛出异常
        Date date1 = sdf3.parse("2020年02月18日 21:58:53");
        System.out.println(date1);


        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-02-18 21:58:53"));
    }
}
