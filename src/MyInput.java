import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInput extends Thread {
    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Enter command");
            try {
                if (br.readLine().equalsIgnoreCase("show")){
                    System.out.println("History of messages:");
                    for (String s:HistoryOfMessages.getMessages()){
                        System.out.println(s);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
