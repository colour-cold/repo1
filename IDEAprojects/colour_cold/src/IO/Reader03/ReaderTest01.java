package IO.Reader03;

import java.io.FileReader;
import java.io.IOException;

/*
    java.io.Reader：字符输入流，是字符输入流的最顶层的父类，定义了一些共性的成员方法，是一个抽象类

    共性的成员方法：
        int read() 读取单个字符并返回
        int read(char[] chars)一次读取多个字符，将字符读入数组
        void close()    关闭流并释放与之关联的所有资源

        java.io.FileReader extends InputStreamReader extends Reader
        FileReader可以读取IDEA默认编码格式(UTF-8)的文件
        FileReader读取系统默认编码(中文GBK)会产生乱码


        FileReader：文件字符输入流
        作用：把硬盘文件中的数据以字符的方式读取到内存中

        构造方法：
            FileReader(String fileName)
            FileReader(File file)
            参数：读取文件的数据源
                String fileName：文件的路径
                File file：一个文件

            FileReader构造方法的作用：
                1.创建一个FileReader对象
                2.会把FileReader对象指向要读取的文件

        字符输入流的使用步骤【重点】
            1.创建FileReader对象，构造方法中绑定要读取的数据流
            2.使用FileReader对象中的方法read读取文件
            3。释放资源
 */
public class ReaderTest01 {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象，构造方法中绑定要读取的数据流
        FileReader fr = new FileReader("src\\IO\\c.txt");

        //2.使用FileReader对象中的方法read读取文件
        /*int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char)len);
        }*/

        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            /*
                String类的构造方法
                    String(char[] chars) ：把字符数组转换为字符串
                    String(cha[] chars,int offset,int count)：把字符数组的一部分转换为字符串，offset为数组的开始索引，count为转换的个数
             */
            System.out.println(new String(chars, 0, len));
        }

        //3.释放资源
        fr.close();
    }
}
