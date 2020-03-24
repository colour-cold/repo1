import java.util.Arrays;

public class ForTest01 {
    /*
    使用for循环完成99乘法表
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println("\n");
        }
        /*
        输出1-100所有的素数并8行进行一次换行
         */
        int t = 0;
        for (int l = 2; l <= 100; l++) {
            boolean num = true;//默认将num看成一个标记
            for (int k = 2; k <= l; k++) {
                if (l % k == 0 && l != k) {
                    num = false;//到这可知l不是素数，所以跳出循环
                    break;
                }
            }
            if (num) {
                System.out.print(l + " ");
                t++;
                if (t % 8 == 0) {
                    System.out.print("\n");
                }
            }
        }

        System.out.println('\n');
        //冒泡排序{102，28，56，42，35，77}从小到大排序
        int[] array = {102, 28, 56, 42, 35, 77};
        for (int i = 0, num = 0; i < 5; i++) {
            if (array[i] > array[i + 1]) {
                num = array[i];
                array[i] = array[i + 1];
                array[i + 1] = num;
                i = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
