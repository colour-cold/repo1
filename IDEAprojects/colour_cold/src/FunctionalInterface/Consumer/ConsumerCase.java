package FunctionalInterface.Consumer;

import java.util.function.Consumer;

/*
    打印信息按照格式：姓名：xx，性别：xx
    要求：将打印姓名的动作作为第一个Consumer接口的Lambda实例
         将打印性别的动作作为第二个Consumer接口的Lambda实例
         将两个Consumer接口按照顺序拼接在一起
 */
public class ConsumerCase {
    public static void method(String[] array, Consumer<String[]> con1, Consumer<String[]> con2) {
        con1.andThen(con2).accept(array);
    }

    public static void main(String[] args) {
        String[] array = {"冷色调", "男", "卢本伟", "男", "xdd", "男"};
        for (int i = 0; i < array.length - 1; i += 2) {
            final int a = i;//设置一个i的final备用值，因为使用Lambda表达式时，Lambda的线程去使用i时，i的线程可能已经将i销毁了，会有可能lambda去找一个不存在的值
            method(array, array1 -> System.out.print("姓名：" + array[a]), array1 -> System.out.println(",性别:" + array[a + 1]));
        }
    }
}
