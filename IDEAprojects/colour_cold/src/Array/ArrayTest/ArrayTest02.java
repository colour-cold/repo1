package Array.ArrayTest;

/*
    数组中存储元素的类型是统一的，每一个元素在内存中所占的空间大小是相同的
    知道数组的首元素的内存地址，要查找的元素只要知道下标就可以快速的计算出偏移量，
    通过首元素的内存地址加上偏移量快速计算出要查找的内存地址，通过内存地址快速定位该元素。
    所以数组查找元素的效率较高。

    数组随机的对数组进行增删元素，当增加元素的时候，为了保证数组中元素在空间存储上是有序的，所以被添加元素位置后面的所有元素都要
    向后移动删除元素也是，后面所有的元素要向前移动，所以数组增删元素效率很低。

    初始化一维数组有两种方式：
        1.静态初始化
        2.动态初始化
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //静态初始化一个int类型的一维数组
        int[] a1 = {10, 12, 31};

        //去的第一个元素
        System.out.println("第一个元素:" + a1[0]);
        System.out.println("最后一个元素:" + a1[2]);
        System.out.println("最后一个元素:" + a1[a1.length - 1]);

        //取得个数
        System.out.println("数组中元素的个数:" + a1.length);

        //遍历一维数组
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        //将第二个元素修改成100
        a1[2] = 100;
        System.out.println("-----------");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
