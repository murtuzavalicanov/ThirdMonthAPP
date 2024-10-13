package TCPClient;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPCLient {
    
    public static void client() throws Exception {
        Socket socket = new Socket(user.IpAndPort.getIp(), user.IpAndPort.getPort());
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        
        byte[] bytes = readbyte(user.IpAndPort.fileLocation());
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
    }
    
    public static byte[] readbyte(String fileName) throws Exception {
        File file = new File(fileName);
        
        try (FileInputStream fileInputStream = new FileInputStream(file);) {
            byte[] bytesArray = new byte[(int) file.length()];
            
            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }
}
