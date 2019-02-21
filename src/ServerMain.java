import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {

    static final int PORT=7777;
    static ArrayList<ConnectionThread> listOfConnections = new ArrayList<>();

    public static void main(String[] args) {
//       new MyInput().start();
        try {
            ServerSocket ss = new ServerSocket(PORT);
            while (true){
                Socket s = ss.accept();
                ConnectionThread ct =new ConnectionThread(s);
                listOfConnections.add(ct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}