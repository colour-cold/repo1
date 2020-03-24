package Recursion;

import java.io.File;

/*
   练习：
        递归打印多级目录

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
public class RecursionTest03 {
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

    //只打印.txt结尾的文件
    private static void recursionNew(File file) {
        File[] f1 = file.listFiles();
        for (File file1 : f1) {
            if (file1.isDirectory()) {//如果file1是文件夹
                recursionNew(file1);//递归
            } else {
                if (file1.getName().endsWith(".txt")) {//如果file1不是文件夹，且通过getName方法将file1转换为字符串后以".txt"结尾
                    System.out.println(file1);//输出这个以".txt"结尾的文件
                }
            }
        }
    }
}