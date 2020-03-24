package String.StringMethod;
/*
    题目:
    键盘输入一个字符串，并且统计其中各种字符出现的次数
    种类有：大写字母、小写字母、数字、其他
 */

import java.util.*;

public class StringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("您输入的奇奇怪怪的东西是：" + str);
        distinguish(str);
    }

    public static void distinguish(String str) {
        byte[] array = str.getBytes();
        int capitalLetter = 0;
        int minuscules = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 65 && array[i] <= 90) {
                capitalLetter++;
            } else if (array[i] >= 97 && array[i] <= 122) {
                minuscules++;
            } else if (array[i] >= 48 && array[i] <= 57) {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母有：" + capitalLetter + "\n" + "小写字母有:" + minuscules + "\n" + "数字有:" + num + "\n" + "其他有:" + other);
    }
}
