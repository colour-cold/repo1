package IO.Case;
/*
    文件复制练习：一读一写

    文件复制的步骤：
        1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write，把读取到的字节写入到目的地文件中
        5.释放资源
 */

import java.io.*;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\冷色调\\Desktop\\java图片\\samo.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\冷色调\\Desktop\\新建文件夹\\samo.jpg");

        long l1 = System.nanoTime();
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);//耗时5亿纳秒左右
        }


        /*       *//*
            使用数组缓冲读取多个字节，写入多个字节
         */
      /*  byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);//耗时100w纳秒
        }*/

        //利用缓冲流试验
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

    /*    int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(len);//耗时800w纳秒
        }*/

        //利用缓冲流加上数组
      /*  byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);//耗时70w纳秒
        }*/


        //释放资源(先关写的，再关读的，如果写完了，肯定读完了)
        /*fos.close();
        fis.close();*/

        bos.close();
        bis.close();

        long l2 = System.nanoTime();
        System.out.println("耗时" + (l2 - l1) + "纳秒");
    }
}
