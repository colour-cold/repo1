package IO.Case;


import java.io.*;
import java.util.*;

/*
    对文章内容根据开始的数字序号进行排序
 */
public class SortTest {
    public static void main(String[] args) throws IOException {
        //创建缓冲输入流构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\冷色调\\Desktop\\新建文件夹\\essay.txt"));
        //创建缓冲输出流构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\冷色调\\Desktop\\新建文件夹\\ccc.txt"));
        //创建Properties集合对象
        Properties prop = new Properties();

        //将文中内容放入利用循环放入集合，且将key值设为序号的字符串形式，value值为内容
        String len = null;
        while ((len = br.readLine()) != null) {
            prop.setProperty(len.charAt(0) + "", len);
        }

        //利用stringPropertyNames把key值放入set集合
        Set<String> set = prop.stringPropertyNames();

        //创建list集合对象
        List<Integer> list = new ArrayList<>();

        //利用增强for循环和Integer类中的字符串转成基本数据类型的方法parseInt(),将key值的int形式存入list集合
        for (String key : set) {
            list.add(Integer.parseInt(key));
        }

        //对key值进行排序
        Collections.sort(list);

        //把key值对应的value值转换为字符串并写入新的文件
        for (Integer integer : list) {
            bw.write(prop.getProperty(integer + ""));
            bw.newLine();
        }

        //调用字符缓冲输出流中的方法flush，把内存缓冲区中的数据，刷新到文件中
        bw.flush();

        //释放资源
        bw.close();
        br.close();


    }
}
