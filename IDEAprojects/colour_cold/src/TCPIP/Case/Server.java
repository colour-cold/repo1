package TCPIP.Case;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\冷色调\\Desktop\\新建文件夹\\samo.jpg");
        ServerSocket serverSocket = new ServerSocket(7899);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        os.write("已存储".getBytes());
        socket.close();
        serverSocket.close();
        is.close();
        os.close();
    }
}
