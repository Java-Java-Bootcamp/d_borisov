import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8091);
            //
            int counter = 0;
            while (counter <= 3) {
                Socket client = server.accept();
                var input = new BufferedReader(new InputStreamReader(client.getInputStream()));
                String message = input.readLine();
                System.out.println(message);
                client.close();
                counter++;
            }
            //
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
