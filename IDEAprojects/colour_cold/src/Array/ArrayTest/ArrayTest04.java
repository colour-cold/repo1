package Array.ArrayTest;
/*
    使用Array相关的API,将一个随机字符串中所有字符升序排列，并倒序打印
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayTest04 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();//生成一个集合
        method(list);
    }

    public static void method(ArrayList<Character> list) {
        Random r1 = new Random();
        int x = r1.nextInt(10);//这个随机数用来决定集合内有0-9个数
        for (int i = 0; i < x; i++) {
            Random r2 = new Random();//
            int a = r2.nextInt(26) + 65;//这个随机数将生成的随机数指定在65-90范围内
            list.add((char) a);//将随机数转换为char形式因为是65-90所以生成的是随机大写字母
        }
        String str1 = "123456789";
        for (int i = 0; i < list.size(); i++) {
            str1 = str1.replace((char) str1.charAt(i), list.get(i));
        }

        System.out.println("随机生成的集合为：" + list);
        Collections.sort(list);//将集合排序
        System.out.println("排序完的集合为：" + list);

        str1 = str1.substring(0, list.size());
        System.out.println("随机生成的字符串为：" + str1);

        String str2 = "123456789";
        for (int i = 0; i < list.size(); i++) {
            str2 = str2.replace((char) str2.charAt(i), list.get(i));
        }
        str2 = str2.substring(0, list.size());
        System.out.println("排序好的字符串为：" + str2);

        String str3 = "";
        for (int i = 0; i < str2.length(); i++) {
            str3 = str2.charAt(i) + str3;
        }
        System.out.println("字符串反向：" + str3);
    }
}
