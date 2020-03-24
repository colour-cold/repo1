package String.StringBuilder;
/*
    java.lang.StringBuilder类  字符串缓冲区，可以提高字符串的效率
    构造方法:
        StringBuilder() 构造一个不带任何字符的字符串生成器，其初始容量为16个字符
        StringBuilder(String str)   构造一个字符串生成器，并初始化为指定的字符内容
*/

public class StringBuilder02 {
    public static void main(String[] args) {
        //空参构造方法
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);//空的

        System.out.println("============================");

        //带字符串的构造方法
        StringBuilder sb2 = new StringBuilder("hello world");
        System.out.println(sb2);//hello world
    }
}
