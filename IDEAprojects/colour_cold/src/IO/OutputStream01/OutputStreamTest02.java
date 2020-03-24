package IO.OutputStream01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    一次写多个字节的方法：
        public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流
        public void write(byte[] b,int off,int len)：从指定的字符数组写入len字节，从偏移量off开始输出到此输出流

 */
public class OutputStreamTest02 {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象，构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream("src\\IO\\e.txt");

        //调用FileOutputStream对象中的方法write，把数据写入到文件中
        //在文件中显示100，需要3个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);

        /*
            public void write(byte[] b)：将b.length字节从指定的字节数组写入此输出流
            一次写多个字节：
                如果写的第一个字节是正数(0-127)那么实现的时候会查询ASCII表
                如果写的第一个字节是负数，那么第一个字节会和第二个字节，两个字节组成一个中文显示，查询系统默认码表(GBK)
         */
        byte[] b = {65, 66, 67, 68, 69};//ABCDE
        //byte[] b = {-65,-66,-67,68,69};//烤紻E
        fos.write(b);

        /*
            public void write(byte[] b,int off,int len)：把字节数组的一部分写入到文件中
                int off：数组的开始索引
                int len：写几个字节
         */
        fos.write(b, 1, 2);//BC

        /*
            写入字符串的方法：可以使用String类中的方法把字符串，转换为字节数组
                byte[] getBytes()：把字符串转换为字节数组
         */
        String s = "你好";
        byte[] b2 = s.getBytes();
        fos.write(b2);
        System.out.println(Arrays.toString(b2));//[-28, -67, -96, -27, -91, -67]


        //释放资源
        fos.close();


    }
}
