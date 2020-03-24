package String.StringBuilder;
/*
    String类
        字符串是常量，它们的值在创建之后不能更改
        字符串的底层是一个final修饰的数组，不能改变，是一个常量
        private final byte[] value;
        在进行字符串的相加时，就会有多个字符串，占用空间多，效率低下

    StringBuilder类
        字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
        底层也是一个数组，但是没有被final修饰，可以改变长度
         byte[] value = new byte[16];
        StringBuilder在内存中始终是一个数组，占用空间少，效率高如果超出了StringBuilder的容量，会自动扩容
 */

public class StringBuilder01 {
}
