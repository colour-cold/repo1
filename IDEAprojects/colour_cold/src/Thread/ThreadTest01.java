package Thread;

/*
    单线程程序：java程序中只有一个线程
    执行从main方法开始，从上到下依次执行

    JVM执行main方法，main方法会进入到栈内存
    JVM会找操作系统一条main方法通向cpu的执行路径
    cpu就可以通过这个路径来执行main方法
    而这个路径有一个名字，叫main(主)线程
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            method01();
            System.out.println(0 / 0);//会抛出异常ArithmeticException: / by zero,由于
            method02();             //单线程特性从上到下依次执行所以method02()不会执行
        }
    }

    private static void method01() {
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
        }
    }

    private static void method02() {
        for (int i = 0; i < 10; i++) {
            System.out.println("2");
        }
    }
}
