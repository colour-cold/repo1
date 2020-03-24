package IO.OutputStream01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    追加写/续写：使用两个参数的构造方法
        FileOutputStream(String name,boolean append) 创建一个向具有指定name的文件中写入数据的输出文件流
        FileOutputStream（File file,boolean append）创建一个向指定File对象表示的文件中写入数据的输出流
        参数:
            String name,File file写入数据的目的地
            boolean append追加写开关
                true:创建对象不会覆盖源文件，继续在文件的末尾追加写数据
                false:创建一个新文件，覆盖源文件

        写换行：写换行符号
            windows：\r\n
            Linux:/n
            mac:/r
 */
public class OutputStreamTest03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\IO\\c.txt", true);

        for (int i = 0; i <= 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
