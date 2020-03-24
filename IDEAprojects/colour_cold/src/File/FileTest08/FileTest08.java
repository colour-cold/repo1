package File.FileTest08;

import java.io.File;
import java.io.FileFilter;

/*
    过滤器
    在File类中有两个和ListFiles重载的方法，方法的参数传递的就是过滤器
      1.File[] listFiles(FileFilter filter)
        java.io.FileFilter接口：用于抽象路径名(File对象)的过滤器
            作用：用来过滤文件(File对象)
            抽象方法：用来过滤文件的方法
                boolean accept(File pathname) 测试指定抽象路径名是否应该包含在某个路径名列表中
                参数：
                    File pathname：使用ListFiles方法遍历目录，得到的每一个文件对象
      2.File[] listFiles(FilenameFilter filter)
        java.io.FilenameFilter接口：实现此接口的类实例可用于过滤器文件名
            作用：用于过滤文件名称
            抽象方法：用于过滤文件的方法
                boolean accept(File dir,String name)：测试指定文件是否应该包含在某一文件列表中
                参数：
                    File dir：构造方法中传递的被遍历的目录
                    String name：使用ListFiles方法遍历目录，获取的每一个文件/文件夹的名称

      注意；
            两个过滤器接口没有实现类，需要我们自己写实现类，重写过滤的方法accept，在方法中自己定义过滤的规则
 */
public class FileTest08 {
    /*
        需求：
        遍历C:\Users\冷色调\Desktop\java图片这个文件夹，以及abc文件夹的子文件夹
        C:\\Users\\冷色调\\Desktop\\java图片\\baiqiu.jpg
        C:\\Users\\冷色调\\Desktop\\java图片\\qiuzhuo.jpg
        C:\\Users\\冷色调\\Desktop\\java图片\\abc.txt
        C:\\Users\\冷色调\\Desktop\\java图片\\abc.java
        C:\\Users\\冷色调\\Desktop\\java图片\\a
        C:\\Users\\冷色调\\Desktop\\java图片\\a\\a.txt
        C:\\Users\\冷色调\\Desktop\\java图片\\a\\a.jpg
        C:\\Users\\冷色调\\Desktop\\java图片\\b
        C:\\Users\\冷色调\\Desktop\\java图片\\b\\b.txt
        C:\\Users\\冷色调\\Desktop\\java图片\\b\\b.jpg
    */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\冷色调\\Desktop\\java图片");
//        recursion(file);

        recursionNew(file);
    }

    //打印全部

    private static void recursion(File file) {
        File[] f1 = file.listFiles();
        for (File file1 : f1) {
            System.out.println(file1);//打印这层目录中的所有文件和文件夹
            if (file1.isDirectory()) {//如果file1是文件夹
                recursion(file1);//递归
            }
        }
    }

    //打印以.txt结尾的文件
  /*  private static void recursionNew(File file) {
        File[] f1 = file.listFiles(new FileFilterImpl());//传递过滤器对象
        *//*
            listFiles方法一共做了三件事情：
                1.listFiles方法会对构造方法中传递的目录进行遍历，获取目录中每一个文件/文件夹-->封装为File对象
                2.listFiles方法会调用参数传递的过滤器中的方法accept
                3.listFiles方法会把遍历得到的每一个File对象，传递给accept方法的参数pathname

            accept方法返回值是一个布尔值
            true：就会把传递过去的File对象保存到File数组中
            false：就不会吧传递过去的File对象保存到File数组中
         *//*

        for (File file1 : f1) {//遍历出的是文件夹和.txt结尾的文件
            if (file1.isDirectory()) {
                recursionNew(file1);
            }
            else {
                System.out.println(file1);
            }
        }
    }*/

    //用File[] listFiles(FileFilter filter)打印以.txt结尾的文件,使用Lambda表达式
    private static void recursionNew(File file) {
        /*File[] f1 = file.listFiles(new FileFilter() {//传递过滤器对象
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().endsWith(".txt");//返回文件夹或者是以.txt结尾的文件
                }
        });*/

        File[] f1 = file.listFiles(pathname ->
                pathname.isDirectory() || pathname.getName().endsWith(".txt"));//返回文件夹或者是以.txt结尾的文件

        for (File file1 : f1) {//遍历出的是文件夹和.txt结尾的文件
            if (file1.isDirectory()) {
                recursionNew(file1);
            } else {
                System.out.println(file1);
            }
        }
    }
}
