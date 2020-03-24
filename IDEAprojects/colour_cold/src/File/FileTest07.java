package File;

import java.io.File;

/*
    File类遍历(文件夹)目录功能
        public String[] List()：返回一个String数组，表示该File目录中的所有子文件或目录
        public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录

    注意：
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在，会抛出空指针异常
        如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
 */
public class FileTest07 {
    public static void main(String[] args) {
        /*
            public String[] List()：返回一个String数组，表示该File目录中的所有子文件或目录
            遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为String对象，多个String对象存储到String数组中

         */
        File f1 = new File("src\\File");
//      File f1 = new File("src\\File01");//NullPointerException
//      File f1 = new File("src\\File\\123.txt");//NullPointerException

        String[] array1 = f1.list();
        for (String s : array1) {
            System.out.println(s);
        }

        /*
            public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录
            遍历构造方法中给出的目录，会获取目录中所有的文件/文件夹，把文件/文件夹封装为File对象，多个File对象存储到File数组中
         */
        File f2 = new File("src\\File");
        File[] array2 = f2.listFiles();
        for (File file : array2) {
            System.out.println(file);
        }
    }
}
