package ArrayList;

import java.util.ArrayList;
import java.util.Random;

/*
    题目：用一个大集合存入20个随机数，然后筛选其中的偶数元素，放到小集合当中。
    要求使用自定义的方法来实现筛选。
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            list.add(r.nextInt(21));
        }
        System.out.println(list);
        Return(list);
    }

    public static void Return(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);
    }
}
