package IO.Exception05;

import java.io.FileWriter;
import java.io.IOException;

/*
    在jdk1.7之前使用try catch finally处理流中的异常
    格式：
        try{
            可能会产生异常的代码
        }catch(异常类变量 变量名) {
            异常的处理逻辑
        }finally{
            一定会执行的代码
            资源释放
        }
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        //提高变量fw的作用域，让finally可以使用
        //变量在定义的时候，没有值，但是而可以使用的时候必须有值
        //fw = new FileWriter("sec\\IO\\d.txt");如果执行失败，那么由于定义的是FileWriter fw;所以会没有值，那么fw.close()就会报错

        //FileWriter fw;
        FileWriter fw = null;
        try {
            //可能会产生异常的代码
            fw = new FileWriter("src\\IO\\d.txt");
            fw.write(97);
        } catch (IOException e) {
            //异常的处理逻辑
            System.out.println(e);
        } finally {
            //一定会执行的代码
            //fw.close()方法声明抛出了IOException异常对象，所以我们就得处理这个异常对象
            //又因为定义的FileWriter fw = null;如果创建对象失败了，fw的默认值就是null，null是不能调用方法的，会抛出NullPointException，需要增加一个判断，不是null再把资源释放
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }
}
