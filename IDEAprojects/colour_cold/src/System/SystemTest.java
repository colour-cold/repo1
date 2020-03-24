package System;
/*
    java.lang.System类中提供了大量的静态方法，常用的有：
        1.public static Long currentTimeMillis() 返回以毫秒为单位的当前时间
        2.public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
            将数组中指定的数据拷贝到另一个数组中
          参数：
                src     -   源数组
                srcPos  -   源数组中的起始位置(起始索引)
                dest    -   目标数组
                destPos -   目标数组中的起始位置
                Length  -   要复制的数组元素的数量
          练习:
                将src数组中的3个元素，复制到dest数组的前3个位置上，复制元素前src数组元素【1，2，3，4，5】
                dest数组元素【6，7，8，9，10】复制元素后，src数组元素【1，2，3，4，5】，dest数组元素【1，2，3，9，10】
 */

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        //1.可以用来测试程序效率
        //验证for循环打印数字1-9999所需要的时间(毫秒)
        Long t1 = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i + 1);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        System.out.println("========================");

        //2.
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array2));
        System.arraycopy(array1, 0, array2, 0, 3);
        System.out.println(Arrays.toString(array2));
    }
}
