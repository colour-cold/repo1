package Exception.Test;


import javax.xml.transform.Result;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        printArray(array);
        int[] result = calculater(100, 200, 300);
        System.out.println(Arrays.toString(result));
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static int[] calculater(int x, int y, int z) {
        int sum = x + y + z;
        int avg = sum / 3;
//        int[] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
//        System.out.println(avg);
//        System.out.println(array[0]);
        int[] array = {sum, avg};
        return array;
    }
}
