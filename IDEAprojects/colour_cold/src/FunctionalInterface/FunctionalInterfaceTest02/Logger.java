package FunctionalInterface.FunctionalInterfaceTest02;

/*
    日志案例

    发现以下代码存在的一些性能浪费的问题
    调用showLog方法，传递的第二个参数是一个拼接后的字符串，是先把字符串拼接后再调用的showLog方法
    showLog方法中如果传递的日志等级不是1级，那么就不会是入此拼接后的字符串，所以字符串就白拼接了，存在了浪费
 */
public class Logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, msg1 + msg2 + msg3);

    }
}
