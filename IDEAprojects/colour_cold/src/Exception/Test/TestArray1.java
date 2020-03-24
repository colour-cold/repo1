package Exception.Test;

import java.util.Arrays;

public class TestArray1 {
    public static void main(String[] args) {
        int[] array = {12, 25, 15, 14, 85, 13, 45, 50};
        for (int i = 0; i < array.length / 2; i++) {
            int x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}
