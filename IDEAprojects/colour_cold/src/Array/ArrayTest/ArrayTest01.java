package Array.ArrayTest;

/*
    1.数组是一种引用类型
    2.数组是一种简单的数据机构，线性的结构
    3.数组是一个容器，可以用来存储其他元素。
    4.数组可以存储任意数据类型的元素
    5.数组分为：一维数组，二维数组，三维数组...多维数组等
    6.数组长度不可改变，数组一旦创建长度是不可变的，固定的-
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //声明一个一维数组，用来存储int类型。
        int[] a1 = {100, 200, 150, 300};//这种方式称作“静态初始化一维数组”
        //boolean类型的数组
        boolean[] b1 = {true, false, true, false};
        //String类型的数组
        String[] strs = {"ABC", "EFG", "HJK"};
        //byte类型数组
        byte[] bytes = {1, 2, 3};
        //char数组
        char[] c1 = {'a', 'b', 'c'};
        //Object数组
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
    }
}
