package IO.Exception05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    JDK7的新特性
    在try的后边可以增加一个(),在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕，会自动把该对象释放，不用写finally
    格式：
        try(定义流对象；定义流对象...) {
            可能会产出异常的代码
        }catch(异常类变量 变量名) {
        异常的处理逻辑}
 */
public class ExceptionTest02 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\冷色调\\Desktop\\java图片\\qiuzhuo.jpg");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\冷色调\\Desktop\\新建文件夹\\qiuzhuo.jpg");) {

        /*
            使用数组缓冲读取多个字节，写入多个字节
         */
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
