package TCPIP.CaseNew;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

/*
    客户端
 */
public class MyClient {
    public static void main(String[] args) throws IOException {
        //读取本地的图片
        FileInputStream fr = new FileInputStream("src\\TCPIP\\CaseNew\\samo.jpg");
        BufferedInputStream bis = new BufferedInputStream(fr);

        //创建套接字
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();


        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            //传给服务器
            os.write(bytes, 0, len);
        }

        /*
            客户端读取本地文件时，fis.read()结束标记是读取到-1结束
            但while循环里是读不到-1的，所以也不会把结束标记写进服务器

            那么服务器中的is.read()在读取客户端上传的文件时，永远也读取不到文件的结束标记
            所以就会进入阻塞状态，一直死循环等待结束标记

            所以在上传完文件时，要给服务器写一个结束标记
            用void shutdownOutput() 禁止此套接字的输出流
            对于TCP套接字，任何以前写入的数据都将被发送，并且后边会跟着TCP的正常连接终止序列
         */
        socket.shutdownOutput();

        //接收服务器返回的消息
        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int len1 = is.read(bytes1);
        System.out.println(new String(bytes1, 0, len1));


        //释放资源
        bis.close();
        socket.close();


    }
}
