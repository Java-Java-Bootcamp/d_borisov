import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8091);
            //
            String message = "Hello server";
            var output = new PrintWriter(socket.getOutputStream(), true);
            output.flush();
            output.println(message);
            //
            socket.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
