package IO.Buffer07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
    java.io.BufferedInputStream extends OutputStream
    BufferedInputStream：字节缓冲输入流

    继承自父类的共性成员方法：
       int read()从输入流中读取数据的下一个字节
        int read(byte[] b)从输入流种读取一定数量的字节，并将其存储在缓冲区数组b中
        void close() 关闭此输入流并释放与该流相关的所有系统资源

    构造方法：
        BufferedInputStream(InputStream in) 创建一个新的缓冲输入流并保存其参数，即输入流in，以便将来使用
        BufferedInputStream(InputStream in,int size) 创建具有指定缓冲区大小的缓冲BufferedInputStream并保存其参数，即输入流in
        参数：
            InputStream out：字节输入流
                我们可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
            int size：指定缓冲流内部缓冲区的大小，不指定则为默认大小

    使用步骤：【重点】
        1.创建FileInputStream对象，构造方法中绑定要输出的目的地
        2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象效率
        3.使用BufferedInputStream对象中的方法read读取文件
        4.释放资源
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的目的地
        FileInputStream fis = new FileInputStream("src\\IO\\e.txt");

        //2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象，提高FileInputStream对象效率
        BufferedInputStream bis = new BufferedInputStream(fis);

        //3.使用FileInputStream对象中的方法read，读取文件
        /*int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println(len);
        }*/

        //int read(byte[] b)从输入流种读取一定数量的字节，并将其存储在缓冲区数组b中
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }


        //4.释放资源
        bis.close();
    }
}
