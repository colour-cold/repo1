package String.StringMethod;
/*
    分割字符串的方法
    public String[] split(String regex) 按照参数的规则，将字符串切分成为若干部分
    当字符串以英文"."分割时，由于正则表达式，必须使用"\\."(两个反斜杠再加.)
 */

import java.util.*;

public class StringMethod4 {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=============================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=============================");

        String str3 = "AAA.BBB.CCC";
        String[] array3 = str3.split(".");
        System.out.println(array3.length);//数组长度为0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);//什么都没有输出
        }
        System.out.println("==============================");

        String[] array4 = str3.split("\\.");
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
    }
}
