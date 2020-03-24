package Exception;

/*
    访问了数组中的3索引，而数组是没有后索引的，这时候，JVM就会检测出程序会出现异常
    JVM会做两件事情：
        1.JVM会根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的【内容，原因，位置】
            new ArrayIndexOutOfBoundsException("3");
        2.在getElement方法中，没有异常的处理逻辑(try...catch),那么JVM就会把异常对象抛出给方法的调用者main方法来处理这个异常

    main方法接收到了这个异常对象，main方法也没有异常的处理逻辑，继续把对象抛出给main方法的调用者JVM处理

    JVM接收到了这个异常对象，做了两个事情
        1.把异常对象【内容，原因，位置】以红色字体打印在控制台
        2.JVM会终止当前正在执行的java程序-->【中断处理】
 */
public class ExceptionTest02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int e = getElement(array, 3);
        System.out.println(e);
    }

    //创建一个方法，获取数组指定索引处的元素
    private static int getElement(int[] array, int index) {
        int ele = array[index];
        return ele;
    }
}
