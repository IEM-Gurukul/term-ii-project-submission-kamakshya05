
// Main.java
import service.TaskManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.Show 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter task: ");
                manager.addTask(sc.nextLine());
            } else if (ch == 2) {
                manager.displayTasks();
            } else {
                break;
            }
        }
    }
}