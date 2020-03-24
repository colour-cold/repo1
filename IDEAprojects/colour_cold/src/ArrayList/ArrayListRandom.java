package ArrayList;

import Abstract.A;

import java.util.ArrayList;
import java.util.Random;

/*
    生成6个1-33之间的随机整数，添加到集合，并遍历集合
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 7; i++) {
            int num = r.nextInt(33) + 1;
            list.add(num);
        }

        for (int a = 0; a < list.size(); a++) {
            System.out.println(list.get(a));
        }
    }
}
