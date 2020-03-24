package FunctionalInterface.FunctionalInterfaceTest02;

/*
    日志案例的优化
 */
public class LambdaTest {
    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, () -> {
            System.out.println("不执行不输出,执行才输出");
            return msg1 + msg2 + msg3;
        });
    }
}
