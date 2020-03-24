package Exception.Test;

public class PractiseMore {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        System.out.println(b(a, b));
    }

    public static void a(int a, int b) {
        boolean x = false;
        if (a == b) {
            x = true;
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

    public static boolean b(int a, int b) {
        boolean same = a == b;
        return same;
    }

    public static boolean c(short a, int b) {
        return a == b;
    }

    public static void d(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("牛逼" + i);
        }
    }
}