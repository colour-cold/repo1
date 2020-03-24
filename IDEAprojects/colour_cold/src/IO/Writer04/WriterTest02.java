package IO.Writer04;

import java.io.FileWriter;
import java.io.IOException;

/*
    追加写/续写：使用两个参数的构造方法
        FileWriter(String fileName,boolean append)
        FileWriter（File file,boolean append）
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
public class WriterTest02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\IO\\d.txt", true);
        for (int i = 0; i < 5; i++) {
            fw.write("HelloWorld" + "\r\n");
        }
        fw.flush();

        fw.close();
    }
}
