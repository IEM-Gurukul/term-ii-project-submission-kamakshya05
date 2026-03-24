import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void saveTask(String task) {
        try {
            FileWriter fw = new FileWriter("tasks.txt", true);
            fw.write(task + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving task");
        }
    }