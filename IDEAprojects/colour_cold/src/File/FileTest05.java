package File;

import java.io.File;

/*
    File判断功能的方法
        public boolean exists()：此File表示的文件或目录是否为实际存在
        public boolean isDirectory() 此File表示的是否为目录
        public boolean isFile()：此File表示的是否为文件
 */
public class FileTest05 {
    public static void main(String[] args) {
//        show01();

        show02();
    }

    private static void show01() {
        /*
            public boolean exists()：此File表示的文件或目录是否为实际存在
            用于判断构造方法中的路径是否存在
                存在：true
                不存在：false
         */
        File f1 = new File("D:\\IdeaProjects\\colour_cold");
        System.out.println(f1.exists());

        File f2 = new File("D:\\IdeaProjects\\colour_cold\\a.txt");
        System.out.println(f2.exists());

        File f3 = new File("colour_cold.iml");//相对路径D:\IdeaProjects\colour_cold\colour_cold.iml
        System.out.println(f3.exists());

        File f4 = new File("a.txt");
        System.out.println(f4.exists());

    }

    private static void show02() {
        /*
            public boolean isDirectory() 此File表示的是否为目录
                用于判断构造方法中给定的路径是否以文件夹结尾
                    是：true
                    否：false

            public boolean isFile()：此File表示的是否为文件
                用于判断构造方法中给定的路径是否以文件结尾
                    是：true
                    否：false

            注意：
                电脑的硬盘中只有文件/文件夹，两个方法是互斥的
                这两个方法使用前提，路径必须是存在的，否则都返回false
         */

        File f1 = new File("D:\\IdeaProjects\\colour_cold");
        //路径不存在就没有必要判断
        if (f1.exists()) {
            System.out.println(f1.isFile());
            System.out.println(f1.isDirectory());
        }

        File f2 = new File("D:\\IdeaProjects\\colour_cold\\a.txt");
        //路径不存在就没有必要判断
        if (f2.exists()) {
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }

        File f3 = new File("D:\\IdeaProjects\\colour_cold\\colour_cold.iml");
        //路径不存在就没有必要判断
        if (f3.exists()) {
            System.out.println(f3.isFile());
            System.out.println(f3.isDirectory());
        }

    }

}
