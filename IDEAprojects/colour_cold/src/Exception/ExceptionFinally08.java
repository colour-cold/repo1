package Exception;

import java.io.IOException;

/*
    finally代码块
    格式：
         try{
            可能产生异常的代码
        }catch(定义一个异常的变量，用来接收try中抛出的异常对象) {
            异常的处理逻辑，产生异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录到一个日志中
        }
        ...
        catch(异常类名，变量名){

        }finally{
            无论是否出现异常都会执行
        }
   注意:
        1.finally不能单独使用，必须和try一起使用
        2.finally一般用于资源释放(资源回收),无论程序是否出现，最后都要资源释放(IO)
        3.如果finally有return语句，永远返回finally中的结果，避免该情况
 */
public class ExceptionFinally08 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.jpg");
        } catch (IOException e) {
            System.out.println("catch - 传递的文件后缀名不是.txt");
        } finally {
            //无论是否出现异常，都会执行
            System.out.println("资源释放");
        }
    }

    private static void readFile(String fileName) throws IOException {
        if (!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("没有异常");
    }
}
