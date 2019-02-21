import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ConnectionThread extends Thread {
    Socket socket;
    String message;

    public ConnectionThread(Socket socket){
        this.socket=socket;
        start();
    }

    @Override
    public void run() {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            System.out.println("Listening...");
            while (true){
                System.out.println("Listening2");
                message=br.readLine();
                System.out.println("mes:"+message);
                if(message.equalsIgnoreCase("exit")) break;
                HistoryOfMessages.saveMessage(message);
            }
            System.out.println("Connection closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
