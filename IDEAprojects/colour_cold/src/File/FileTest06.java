package File;

import java.io.File;
import java.io.IOException;

/*
    File类创建删除功能的方法
        public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
        public boolean delete()：删除由此File表示的文件或目录
        public boolean mkdir()：创建由此File表示的目录
        public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录
 */
public class FileTest06 {
    public static void main(String[] args) throws IOException {
//        show01();

//        show02();

        show03();
    }

    private static void show01() throws IOException {
        /*
            public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
            创建文件的路径和名称在构造方法中给出(构造方法的参数)
            返回值：布尔值
                true：文件不存在，创建文件，返回true
                false：文件存在，不会创建，返回false

            注意：
                1.此方法只能创建文件，不能删除文件
                2.创建文件的路径必须存在，否则会抛出异常

            public boolean createNewFile() throws IOException
            createNewFile声明抛出了IOException，我们调用这个方法，就必须处理这个异常，要么throws，要么try...catch
         */
        File f1 = new File("D:\\IdeaProjects\\colour_cold\\src\\File\\123");//使用绝对路径
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        File f2 = new File("src\\File\\a.txt");//使用相对路径
        boolean b2 = f2.createNewFile();
        System.out.println(b2);

        File f3 = new File("src\\File01\\a.txt");//使用相对路径
        boolean b3 = f3.createNewFile();
        System.out.println(b3);//路径不存在，抛出IOException

    }

    private static void show02() {
        /*
            public boolean mkdir(): 创建单极空文件夹
            public boolean mkdirs()：既可以创建单级空文件夹，又可以创建多级文件夹
            创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
            返回值：布尔值
                true：文件夹不存在，创建文件，返回true
                false：文件夹存在，不会创建，返回false，构造方法中给出的路径不存在也返回false

            注意：
                1.此方法只能创建文件夹，不能删除文件夹
         */
        File f1 = new File("src\\File\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println(b1);

        //利用mkdirs方法创建多级文件夹
        File f2 = new File("src\\File\\111\\222\\333");
        boolean b2 = f2.mkdirs();
        System.out.println(b2);


        File f3 = new File("src\\File01\\aaa");
        boolean b3 = f3.mkdir();
        System.out.println(b3);
    }

    private static void show03() {
        /*
            public boolean delete()：删除由此File表示的文件或目录
            此方法，可以删除构造方法路径中给出的文件/文件夹
            返回值：布尔值
                true：文件/文件夹删除成功，返回true
                false：文件夹中有内容，不会删除，返回false。构造方法中路径不存在返回false

            注意：delete方法是直接在硬盘删除文件/文件夹，不走回收站，删除要谨慎
         */
        File f1 = new File("src\\File\\123");
        boolean b1 = f1.delete();
        System.out.println(b1);

        File f2 = new File("src\\File\\aaa");//a中有内容所以不删除
        boolean b2 = f1.delete();
        System.out.println(b2);

    }
}
