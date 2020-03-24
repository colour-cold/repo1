package TCPIP.CaseNew;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器
 */
public class MyServer {
    public static void main(String[] args) throws IOException {

        new Thread(new Runnable() {//设置多线程服务器，但是由于父类不具有抛出异常，所以里面的内容不能抛出异常需要try catch处理
            @Override
            public void run() {
                try {
                    //让服务器一直运行不关闭
                    while (true) {
                        //接收客户端传来的信息,并写入本地硬盘
                        ServerSocket server = new ServerSocket(9999);
                        Socket socket = server.accept();

                        File file = new File("C:\\Users\\冷色调\\Desktop\\新建文件夹\\硬盘");

                    /*
                        设置名字定义的格式：picture + 毫秒值 + 文件类型
                     */
                        String fileName = "\\picture" + System.currentTimeMillis() + ".jpg";

                        if (!file.exists()) {
                            file.mkdirs();
                        }

                        FileOutputStream fos = new FileOutputStream(file + fileName);
                        BufferedOutputStream bos = new BufferedOutputStream(fos);

                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            bos.write(bytes, 0, len);
                        }

                        System.out.println("收到图片");


                        //返回已存储图片的信息
                        OutputStream os = socket.getOutputStream();
                        os.write("已存储".getBytes());

                        //释放资源
                        bos.close();
                        socket.close();
                        server.close();
                    }
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }).start();
    }
}
