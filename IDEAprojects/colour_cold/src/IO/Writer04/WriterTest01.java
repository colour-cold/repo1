package IO.Writer04;
/*
    java.io.Writer  字符输出流，是所有字符输出流的最顶层的父类，是一个抽象类

    共性的成员方法：
        void write(int c) 写入单个字符
        void write(char[] chars) 写入字符数组
        abstract void write(char[] chars,int off,int len) 写入字符数组的某一部分，off是数组的开始索引，len是写的字符个数
        void writes(String str) 写入字符串
        void write(String str,int off,int len) 写入字符串中的某一部分，off字符串的开始索引，len是写的字符个数
        void flush() 刷新该流的缓冲
        void close() 关闭此流，但要先刷新它

    java.io.FileWriter extends OutputStreamWriter extends Writer
    FileWriter：文件字符输出流
    作用：把内存中字符数据写入到文件中

    构造方法：
        FileWriter(File file)根据给定的File对象构造一个FileWriter对象
        FileWriter(String fileName) 根据给定的文件名构造一个FileWriter对象
        参数：写入数据的目的地
            String fileName：文件的路径
            File file：是一个文件
        构造方法的作用：
            1.会创建一个FileWriter对象
            2.会根据构造方法中传递的文件/文件的路径，创建文件
            3.会把FileWriter对象指向创建好的文件

     字符输出流的使用步骤【重点】：
        1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        2.使用FileWriter中的方法Writer，把数据写入到内存缓冲区中(字符转换为字节的过程）
        3.使用FileWriter中的方法flush，把内存缓冲区的数据，刷新到文件中
        4.释放资源(会先把内存缓冲区中的数据刷新到文件中)
        注意：
            flush：先刷新缓冲区，流对象可以继续使用
            close：先刷新缓冲区，然后通知系统释放资源，该对象不可以再被使用
 */

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest01 {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("src\\IO\\d.txt");

        //2.使用FileWriter中的方法writer，把数据写入到内存缓冲区中(字符转换为字节的过程）
        //void write(int c)
        fw.write(97);

        //void write(char[] chars) 写入字符数组
        char[] chars = {'1', '2', 'a', 'b'};
        fw.write(chars);

        //abstract void write(char[] chars,int off,int len) 写入字符数组的某一部分，off是数组的开始索引，len是写的字符个数
        fw.write(chars, 0, 2);

        //void writes(String str) 写入字符串
        fw.write("牛逼");

        //void write(String str,int off,int len) 写入字符串中的某一部分，off字符串的开始索引，len是写的字符个数
        String s = "abcde";
        fw.write(s, 0, 3);

        //3.使用FileWriter中的方法flush，把内存缓冲区的数据，刷新到文件中
        fw.flush();

        //释放资源
        fw.close();
    }

}
