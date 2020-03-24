package File;

import java.io.File;
import java.io.FilenameFilter;

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
public class FileTest09 {
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

        recursionNew(file);
    }


    //用File[] listFiles(FilenameFilter filter)打印以.txt结尾的文件,使用Lambda表达式
    private static void recursionNew(File file) {
        /*File[] f1 = file.listFiles(new FilenameFilter() {//传递过滤器对象
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.endsWith(".txt");
            }
        });*/

        File[] f1 = file.listFiles((dir, name) -> new File(dir, name).isDirectory() || name.endsWith(".txt"));

        for (File file1 : f1) {//遍历出的是文件夹和.txt结尾的文件
            if (file1.isDirectory()) {
                recursionNew(file1);
            } else {
                System.out.println(file1);
            }
        }
    }
}

