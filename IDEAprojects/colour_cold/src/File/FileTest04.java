package File;

import java.io.File;

/*
    File类获取功能的方法
        public String getAbsolutePath()：返回此File的绝对路径名字符串
        public String getPath()：将此File转换为路径名字符串
        public String getName()：返回由此File表示的文件或目录的名称
        public Long Length()：返回由此File表示的文件的长度
 */
public class FileTest04 {
    public static void main(String[] args) {
//        show01();

//        show02();

//        show03();

        show04();
    }

    private static void show01() {
        /*
            public String getAbsolutePath()：返回此File的绝对路径名字符串
            获取的构造方法中传递的路径
            无论路径是绝对的还是相对的，getAbsolutePath()：方法返回的都是绝对路径

         */
        File f1 = new File("D:\\IdeaProjects\\colour_cold\\a.txt");
        String absolutePath1 = f1.getAbsolutePath();
        System.out.println(absolutePath1);//D:\IdeaProjects\colour_cold\a.txt

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();//D:\IdeaProjects\colour_cold\a.txt
        System.out.println(absolutePath2);
    }

    private static void show02() {
        /*
            public String getPath()：将此File转换为路径名字符串
            获取的构造方法中传递的路径

            toString方法调用的就是getPath方法
            源码:
                Public String toString() {
                    return getPath();
                }
         */
        File f1 = new File("D:\\IdeaProjects\\colour_cold\\a.txt");
        File f2 = new File("a.txt");
        String path1 = f1.getPath();
        String path2 = f2.getPath();
        System.out.println(path1);//D:\IdeaProjects\colour_cold\a.txt
        System.out.println(path2);//a.txt
        System.out.println(f1);//D:\IdeaProjects\colour_cold\a.txt
        System.out.println(f1.toString());//D:\IdeaProjects\colour_cold\a.txt
    }

    private static void show03() {
        /*
            public String getName()：返回此File表示的文件或目录的名称
            获取的就是构造方法传递路径的结尾部分(文件/文件夹)
         */
        File f1 = new File("D:\\IdeaProjects\\colour_cold\\a.txt");
        String nam1 = f1.getName();
        System.out.println(nam1);//a.txt

        File f2 = new File("D:\\IdeaProjects\\colour_cold");
        String name2 = f2.getName();
        System.out.println(name2);//colour_cold
    }

    private static void show04() {
        /*
            public Long Length()：返回由此File表示的文件的长度
            获取的是构造方法指定的文件的大小，以字节为单位

            注意：
                文件夹是没有大小概念的，不能获取文件夹的大小
                如果构造方法中给出的路径不存在，那么length方法返回0
         */
        File f1 = new File("C:\\Users\\冷色调\\Desktop\\java图片\\a.txt");
        Long l1 = f1.length();
        System.out.println(l1);

        File f2 = new File("C:\\Users\\冷色调\\Desktop\\java图片\\b.txt");
        Long l2 = f2.length();
        System.out.println(l2);

        File f3 = new File("C:\\Users\\冷色调\\Desktop\\java图片");
        Long l3 = f3.length();
        System.out.println(l3);

    }

}
