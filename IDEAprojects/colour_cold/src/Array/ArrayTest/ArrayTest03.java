package Array.ArrayTest;

/**
 * 动态初始化一维数组
 * 1.动态初始化一维数组会先在堆内存中分配这个数组，并且在数组中每一个元素都采用默认值。
 * byte,short,int,long 0
 * float,double 0.0
 * boolean false
 * char \u0000
 * 引用 null
 */

public class ArrayTest03 {
    //动态声明一个数组int类型，最多可以存储4个元素
    public static void main(String[] args) {
        int[] a1 = new int[4];
        //遍历
        for (int n = 0; n < a1.length; n++) {
            System.out.println(a1[n]);
        }
        //赋值
        a1[0] = 20;
        a1[1] = 20;
        a1[2] = 20;
        a1[3] = 20;

        //遍历
        for (int n = 0; n < a1.length; n++) {
            System.out.println(a1[n]);
        }

        Object[] objs = new Object[3];
        for (int index = 0; index < objs.length; index++) {

        }
    }
}
