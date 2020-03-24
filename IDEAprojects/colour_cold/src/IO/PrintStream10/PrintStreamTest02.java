package IO.PrintStream10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    可以改变输出语句的目的地(打印流的流向)
    输出语句，默认在控制台输出
    使用System.setOut()方法改变输出语句的目的地改为参数中传递的打印流的目的地
        static void setOut(PrintStream out) 重新分配："标准"输出流
 */
public class PrintStreamTest02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("这句语句在控制台输出");

        PrintStream ps = new PrintStream("src\\IO\\PrintStream10\\目的地打印流.txt");
        System.setOut(ps);
        System.out.println("这句语句在打印流目的地中输出");

        ps.close();
    }
}
