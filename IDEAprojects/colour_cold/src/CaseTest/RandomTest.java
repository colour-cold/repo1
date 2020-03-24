package CaseTest;

import java.util.*;

public class RandomTest {
    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Random r = new Random();
        int num = r.nextInt(100);
        System.out.println(num);
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你猜的数字：");
        int i = sc.nextInt();
        while (i != num) {
            if (i > num) {
                System.out.println("你猜的太大了,请再次输入:");
                int i1 = sc.nextInt();
                i = i1;
            }
            if (i < num) {
                System.out.println("你猜的太小了,请再次输入:");
                int i2 = sc.nextInt();
                i = i2;
            }
        }
        if (i == num) {
            System.out.println("你猜对了" + "正确数字是：" + num);
        }
    }
}