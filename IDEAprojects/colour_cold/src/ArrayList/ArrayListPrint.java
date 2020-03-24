package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(50);
        list.add(36);
        list.add(45);
        ArrayListPrint(list);
    }

    public static void ArrayListPrint(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("{" + list.get(i) + "@");
            } else if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
