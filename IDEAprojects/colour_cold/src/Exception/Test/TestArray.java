package Exception.Test;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        int[] array = {12, 25, 15, 14, 85, 13, 45};
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                int min = array[i - 1];
                array[i - 1] = array[i];
                array[i] = min;
                i = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
