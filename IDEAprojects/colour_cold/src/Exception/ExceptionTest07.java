package Exception;

import java.io.IOException;

/*
    Throwable类中定义了3个异常处理的方法
    String getMessage() 返回此 throwable的简短描述
    String toString()   返回此throwable的详细消息字符串
    void printStackTrace()  JVM打印异常对象，默认此方法，打印的异常信息是【最全面】的
 */
public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.jpg");
        } catch (IOException e) {
            System.out.println(e.getMessage());//文件的后缀名不对
            System.out.println(e.toString());//java.io.IOException: 文件的后缀名不对
            System.out.println(e);//java.io.IOException: 文件的后缀名不对
            e.printStackTrace();/*java.io.IOException: 文件的后缀名不对
                                    at Exception.ExceptionTest07.readFile(ExceptionTest07.java:30)
                                    at Exception.ExceptionTest07.main(ExceptionTest07.java:14)
                                 */
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
