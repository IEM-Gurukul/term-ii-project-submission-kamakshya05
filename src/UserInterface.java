import service.TaskManager;
import java.util.Scanner;

public class UserInterface {
    TaskManager manager = new TaskManager();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.Add 2.View 3.Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                manager.addTask(task);
                Storage.saveTask(task);
            } else if (choice == 2) {
                manager.viewTasks();
            } else {
                break;
            }
        }
    }
}