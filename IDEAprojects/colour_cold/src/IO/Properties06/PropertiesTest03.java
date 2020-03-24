package IO.Properties06;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
    可以使用Properties集合中的方法load，把硬盘中保存的文件(键值对)，读取到集合中使用
    void load(InputStream inStream)
    void load(Reader reader)
    参数：
        InputStream inStream：字节输入流，不能读取含有中文的键值对
        Reader reader ：字符输入流，能读取含有中文的键值对

    使用步骤：
        1.创建Properties集合对象
        2.使用Properties集合对象中的方法load读取保存键值对的文件
        3.遍历Properties集合

    注意：
        1.存储键值对的文件中，键与值默认的连接符号可以使用"=","空格等
        2.存储键值对的文件中，可以使用#进行注释，被注释的键值对不会再被读取
        3.存储键值对的文件中，键与值默认都是字符串，不用再加引号
 */
public class PropertiesTest03 {
    public static void main(String[] args) throws IOException {
      /*  //1.创建Properties集合对象和字符输入流对象
        FileReader fr = new FileReader("src\\IO\\prop.txt");
        Properties prop = new Properties();

        //2.使用Properties集合对象中的方法load读取保存键值对的文件
        prop.load(fr);

        //3.遍历Properties集合
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }*/


        //1.创建Properties集合对象
        Properties prop = new Properties();

        //2.使用Properties集合对象中的方法load读取保存键值对的文件
        prop.load(new FileInputStream("src\\IO\\prop.txt"));

        //3.遍历Properties集合
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
