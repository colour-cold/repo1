package CaseTest;

import static java.lang.Math.*;

/*
    java.lang.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作

    public static double abs(double num) 获取的绝对值
    public static double ceil(double num)  向上取整
    public static double floor(double num)  向下取整
    public static Long round(double num)    四舍五入
    Math.PI 圆周率

    题目：
    计算在-10.8到5.5之间，绝对值大于6 或者小于2.1的整数有多少个？
 */
public class MathTest {
    public static void main(String[] args) {
        int num = 0;
        for (double i = -10.4; i < 5.5; i++) {
            if (abs(ceil(i)) > 6 || abs(ceil(i)) < 2.1) {
                num++;
            }
        }
        System.out.println("在此区间有符合规则的整数：" + num);
    }
}
