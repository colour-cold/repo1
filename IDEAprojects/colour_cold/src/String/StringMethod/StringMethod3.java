package String.StringMethod;
/*
    String当中与转换相关的常用方法有
    public char[] toCharArray() 将当前字符串拆分成字符组作为返回值
    public byte[] getBytes()    获得当前字符串底层的字符数组
    public String replace(CharSequence oldString, CharSequence newString)
    将所有出现的老字符串替换成新的字符串，返回替换之后的结果新字符串
 */

import java.util.Arrays;

public class StringMethod3 {
    public static void main(String[] args) {
        char[] array = "HelloWorld".toCharArray();
        System.out.println(Arrays.toString(array));
        System.out.println("=============================");

        byte[] array1 = "abc".getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println("=============================");

        String str1 = "OK bro";
        String str2 = str1.replace("o", "ather");
        System.out.println(str2);
    }
}
