package ArrayList;

import java.util.ArrayList;
/*
    如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

    基本类型    包装类（引用类型，包装类都位于java.lang包下）
    byte        Byte
    short       Short
    int         Integer     【特殊】
    long        Long
    float       Float
    double      Double
    char        Character   【特殊】
    boolean     Boolean

 */

public class Test01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("卢本伟");
        list.add("五五开");
        list.add("赌怪");
        list.add("蛇皮怪");
        System.out.println(list);
        String name = list.get(0);
        System.out.println("第零号元素是：" + name);
        String whoRemoved = list.remove(3);
        System.out.println("数组中被删除的是：" + whoRemoved);
        System.out.println("数组长度是：" + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
