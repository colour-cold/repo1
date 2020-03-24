package Recursion;

/*
    使用递归计算1-n之间的和

    注意：
        使用递归求和main方法调用sum方法，sum方法会一直调用sun方法，导致在内存中有多个sum方法(频繁的创建方法，调用方法，销毁方法)效率低下
        所以如果仅仅是计算1-n的和不推荐递归，for循环即可
 */
public class RecursionTest02 {
    public static void main(String[] args) {
        int sum = a(100);
        System.out.println(sum);

        int result = b(5);
        System.out.println(result);
    }

    private static int a(int n) {
        if (n == 1) {
            return 1;
        }
        return n + a(n - 1);
    }


    private static int b(int n) {
        if (n == 1) {
            return 1;
        }
        return n * b(n - 1);
    }
}
