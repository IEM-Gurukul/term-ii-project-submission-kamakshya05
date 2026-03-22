
// Main.java
import service.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Task 1");
        System.out.println(manager.getTasks().size());
    }
}