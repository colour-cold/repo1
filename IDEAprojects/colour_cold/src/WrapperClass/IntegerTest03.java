package WrapperClass;

/*
    基本类型与字符串类型之间的相互转换
    基本类型->字符串(String)
        1.基本类型的值 + ""   最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数类型),不是Object类的toString()重载
            static String toString(int i) 返回一个表示指定整数的String对象
        3.String类的静态方法valueOf(参数类型)
            static String valueOf(int i)  返回int参数的字符串表示形式
    字符串（String）->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类： static double parseDouble(String s)
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);//100200

        System.out.println("=======================");

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);//100200

        System.out.println("========================");

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);//100200

        System.out.println("========================");

        String s4 = "100";
        Integer i2 = Integer.parseInt(s4);
        System.out.println(i2 + 200);//300

        String s5 = "100";
        Double i3 = Double.parseDouble(s5);
        System.out.println(i3 + 200);//300.0
    }
}
