import model.Task;

import java.util.ArrayList;

public class Stats {
    public void showStats(ArrayList<Task> tasks) {
        int completed = 0;

        for (Task t : tasks) {
            if (t.isCompleted()) completed++;


            System.out.println("Completed: " + completed);
            System.out.println("Total: " + tasks.size());
        }
    }
}