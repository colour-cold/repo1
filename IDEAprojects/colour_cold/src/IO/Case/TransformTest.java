package IO.Case;

import java.io.*;

/*
    转换文件的编码
    将GBK编码文本文件，转换为utf-8的编码文本文件
 */
public class TransformTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\IO\\Test08\\gbk.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\IO\\Case\\UTF-8.txt"), "utf-8");

        int len = 0;
        while ((len = isr.read()) != -1) {
            osw.write(len);
        }

        osw.flush();

        osw.close();
        isr.close();

    }
}
