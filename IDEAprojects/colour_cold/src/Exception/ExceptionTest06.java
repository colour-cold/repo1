package Exception;

import java.io.IOException;

/*
    try...catch 异常处理的第二种方式，自己处理异常
    格式：
        try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象) {
            异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名，变量名){

        }
     注意：
        1.try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
        2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
          如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，执行完try中的代码，继续执行try...catch之后的代码
 */
public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.jpg");
        } catch (IOException e) {//try中抛出什么异常，catch就定义什么异常变量，用来接受这个异常对象
            System.out.println("catch - 传递的文件后缀名不是.txt");
        }
        System.out.println("后续代码");
    }

    private static void readFile(String fileName) throws IOException {
     /*
            如果传递的路径不是.txt结尾
            那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("没有异常");
    }
}
