package File;
/*
    File类的构造方法

        1.File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建一个新File实例
            参数：
             String pathname：字符串的路径名称
             路径可以是以文件结束，也可以是以文件夹结尾
             路径可以是相对路径，也可以是绝对路径
             路径可以是存在，也可以是不存在
             创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况

        2.File(String parent,String child) 根据parent路径名字符串和child名字符串创建一个新File实例
            参数：把路径分成了两份
                String parent：父路径
                String child：子路径

            好处：
                父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化

        3.File(File parent,String child) 根据parent路径名字符串和child名字符串创建一个新File实例
            参数：把路径分成了两份
                File parent：父路径
                String child：子路径

            好处：
                父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
                父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
     */

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
//      show01();

//      show02("C:\\","a.txt");

        show03();
    }

    private static void show01() {
        File f1 = new File("D:\\IdeaProjects\\colour_cold\\src");
        System.out.println(f1);

        File f2 = new File("a.txt");
        System.out.println(f2);
    }

    private static void show02(String parent, String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    private static void show03() {
        File f1 = new File("C:\\");
        File f2 = new File(f1, "a.txt");
        System.out.println(f2);
    }
}
