import java.util.ArrayList;

public class HistoryOfMessages {
    private static ArrayList<String> store = new ArrayList();

    public static void saveMessage(String message) {
        System.out.println("save");
        store.add(message);
    }

    public static ArrayList<String> getMessages() {
        return store;
    }
}
