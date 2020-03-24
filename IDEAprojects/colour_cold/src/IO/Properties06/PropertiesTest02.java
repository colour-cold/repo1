package IO.Properties06;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
    void store(OutputStream out,String comments)
    void store(Writer writer,String comments)
    参数：
        OutputStream out：字节输出流，不能写入中文
        Writer writer：字符输出流，可以写入中文
        String comments：注释，用来解释说明保存的文件是做什么用的
            comments的内容不能使用中文，会产生乱码，默认是Unicode编码
            一般使用""空字符串

    使用步骤：
        1.创建Properties集合对象，添加数据
        2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
        3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        4.释放资源
 */
public class PropertiesTest02 {
    public static void main(String[] args) throws IOException {

        //创建字符流
        /* //1.创建Properties集合对象,添加数据
        Properties prop = new Properties();
        prop.setProperty("五五开","nb");
        prop.setProperty("卢本伟","nb");
        prop.setProperty("white","nb");

        //2.创建字符输出流对象，构造方法中绑定要输出的目的地
        FileWriter fw = new FileWriter("src\\IO\\prop.txt");

        //3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        prop.store(fw,"save data");

        //4.释放资源
        fw.close();*/

        //创建字节流
        //1.创建Properties集合对象,添加数据
        Properties prop = new Properties();
        prop.setProperty("五五开", "nb");
        prop.setProperty("卢本伟", "nb");
        prop.setProperty("white", "nb");

        //2.创建字符输出流对象，构造方法中绑定要输出的目的地
        FileOutputStream fos = new FileOutputStream("src\\IO\\prop.txt");

        //3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        prop.store(fos, "");//由于是中文字节流无法直接存储中文

        //4.释放资源
        fos.close();

    }
}
