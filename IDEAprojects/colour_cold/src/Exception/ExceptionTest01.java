package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable类是java语言中所有的错误或异常的超类
        Exception：编译期异常，进行编译(写代码)java程序出现的问题
            RuntimeException：运行期异常，java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病，把异常处理掉，程序可以继续执行

        Error错误:
            错误就相当于程序的了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        //Exception:编译期异常，进行编译(写代码)java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
//      Date date = sdf.parse("2020-02-25");//会报错，编译器异常


        //1.直接抛出异常在 public static void main(String[] args) throws ParseException{}

        //2.使用try catch
        Date date = null;
        try {
            date = sdf.parse("202002-25");//把字符串格式的日期，解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("后续代码");

        //RuntimeException:运行期异常，java程序运行过程中出现的问题
        int[] array = {1, 2, 3};
        try {
            //可能会出现异常的代码
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //异常的处理逻辑
            System.out.println(e);
        }
        System.out.println("后续代码");

        //Error:错误
        //OutOfMemoryError：Java heap space
        //内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存

        //必须修改代码，创建的数组小一点
        int[] arr = new int[1024 * 1024 * 1024];
    }
}
