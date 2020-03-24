package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常，那么我们就必须处理这个异常
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理(自己不处理，给别人处理)，最终交给JVM处理-->中断处理
    使用格式：在方法声明时使用
        修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{
            throw new AAAException("产生原因");
            throw new BBBException("产生原因");
            ...
        }
    注意：
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有子父类关系，那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法，那么我们就必须处理声明的异常
            要么继续使用throws声明抛出，交给方法的调用者处理，最终交给JVM
            要么try...catch自己处理异常
 */
public class ExceptionTest05 {
    public static void main(String[] args) throws Exception {
        readFile("c:\\a.jpg");
    }

    private static void readFile(String fileName) throws Exception {
        if (!fileName.startsWith("c:\\")) {
            throw new FileNotFoundException("传递的文件路径不是c:\\");
        }

        /*
            如果传递的路径不是.txt结尾
            那么我们就抛出IO异常对象，告知方法的调用者，文件的后缀名不对
            因为IOException都是Exception异常的子类，所以可以只写Exception
         */
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
    }
}
