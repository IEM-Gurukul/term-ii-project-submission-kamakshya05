import service.TaskManager;
import java.util.Scanner;

public class UserInterface {
    TaskManager manager = new TaskManager();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Normal Task");
            System.out.println("2.Add Priority Task");
            System.out.println("3.View Tasks");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();
                manager.addTask(task);
                Storage.saveTask(task);
                Reminder reminder = new Reminder();
                reminder.remind(task);

            } else if (choice == 2) {
                System.out.print("Enter task: ");
                String task = sc.nextLine();

                System.out.print("Enter priority (High/Medium/Low): ");
                String priority = sc.nextLine();

                manager.addPriorityTask(task, priority);
                Storage.saveTask(task);

            } else if (choice == 3) {
                manager.viewTasks();
                Stats stats = new Stats();
                stats.showStats(manager.getTasks());

            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}