package IO.InputStream02;

import java.io.FileInputStream;
import java.io.IOException;

/*
    字节输入流一次读取多个字节的方法
        int read(byte[] b)从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中

    明确两件事情：
        1.方法的参数byte[]的作用？
            起到缓冲作用，存储每次读取到的多个字节
            数组的长度一般定义1024(1kb)或者1024的整数倍
        2.方法的返回值int是什么？
            每次读取的有效字节个数

    String类的构造方法：
        String(byte[] bytes)：把字节数组转换为字符串
        String(byte[] bytes,int offset,int length)：把字节数组的一部分转换为字符串，offset是数组的开始索引，length是转换的字符个数
 */
public class InputStreamTest02 {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("src\\IO\\b.txt");

        //使用FileInputStream对象中的方法read读取文件
        //int read(byte[] b)从输入流中读取一定数量的字符，并将其存储在缓冲区数组b中

        /*
            1.在下面代码中首先创建了一个可以存放两个值的byte[]数组，当第一块代码执行时，将A，B分别存入了数组中，返回了有效字节个数2
            2.第二块代码执行时又将CD替换了本来AB所占的区域，返回有效字节个数2
            3.第三块代码执行时只用E替换了C，所用数组中还是存储着E和D，所以输出ED，返回的有效字节个数为1
            4.第四块代码执行时，没有替换数组中任何元素，所以还是输出ED，然后返回结束标记-1
         */
       /* byte[] b = new byte[2];
        int len1 = fis.read(b);
        System.out.println(len1);//2
        System.out.println(Arrays.toString(b));//[65,66]
        System.out.println(new String(b));//AB


        int len2 = fis.read(b);
        System.out.println(len2);//2
        System.out.println(new String(b));//CD


        int len3 = fis.read(b);
        System.out.println(len3);//1
        System.out.println(new String(b));//ED

        int len4 = fis.read(b);
        System.out.println(len4);//-1
        System.out.println(new String(b));//ED*/

        /*
            发现以上读取是一个重复的过程，可以使用循环优化
            不知道文件中有多少字节，所以使用while循环
            while循环结束的条件，读取到-1结束
            使用String(byte[] bytes,int offset,int length)：把字节数组的一部分转换为字符串，offset是数组的开始索引，length是转换的字符个数
         */
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }


        //释放资源
        fis.close();
    }
}
