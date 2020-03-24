package Array.Tool;
/*
    public static String toString(数组) 将参数数组变成字符串（按默认格式：[元素1、元素2、元素3....]）
    public static void sort(数组) 按照默认升序（从小到大）对数组的元素进行排序
 */

import java.util.*;

public class ArrayTool {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);//集合的排序
        System.out.println(list);
        int[] array = {1, 25, 9, 32, 41, 0};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
