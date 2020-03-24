package TCPIP.Case;

import java.io.*;
import java.net.Socket;

public class Customer {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src\\TCPIP\\CaseNew\\samo.jpg");
        Socket socket = new Socket("127.0.0.1", 7899);
        OutputStream os = socket.getOutputStream();

        byte[] b = new byte[1024];
        int len1 = 0;
        while ((len1 = fis.read(b)) != -1) {
            os.write(b, 0, len1);
        }
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        socket.close();
    }
}
