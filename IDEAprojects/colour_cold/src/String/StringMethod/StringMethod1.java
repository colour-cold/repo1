package String.StringMethod;

/*
    String当中与获取相关常用方法有：
    public int length() 获取字符串当中含有的字符个数，拿到字符长度。
    public String concat(String str)    将当前字符串和参数字符串拼接成返回值新的字符串
    public String equals    Public String equalsIgnoreCase比较两个字符串的内容equalsIgnoreCase是忽略字符串大小写进行比较，==是比较两个字符串的地址值。
    public char charAt(int index)   获取指定索引位置的单个字符（索引从0开始）
    public int indexOf(String str)  查找参数字符串在本字符串当中首次出现的索引位置，如果没有则返回-1值
 */
public class StringMethod1 {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "danjkcbhsacbjksabkcjbkajbck fbukcbhkaicudwahgi uhiuaw".length();
        System.out.println("字符串长度是:" + length);
        System.out.println("=============================");

        //拼接字符串
        String s1 = "Colour";
        String s2 = "-";
        String s3 = "Cold";
        System.out.println("拼接后的字符串为：" + s1.concat(s2).concat(s3));
        System.out.println("=============================");

        //字符串内容比较
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ABC";
        System.out.println(str1.equals(s2));//false
        System.out.println(str1.equals(s3));//false
        System.out.println(str1.equalsIgnoreCase(s3));//false
        System.out.println("===============================");

        //获取字符串索引位置的单个字符
        char x = "HelloWorld".charAt(5);
        System.out.println("索引值为5的字符是:" + x);
        System.out.println("===============================");

        //查找参数字符串在本来字符串中出现的第一次索引位置
        //如果没有，则返回-1值
        String string = "HelloWorld";
        int index = string.indexOf("llo");
        int index1 = string.indexOf("abc");
        System.out.println("llo字符出现的位置在原字符串中的索引值是：" + index);
        System.out.println(index1);//因为HelloWorld中没有abc这个字符串所以返回-1
    }
}
