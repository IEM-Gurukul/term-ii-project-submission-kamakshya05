// service/TaskManager.java
package service;

import java.util.ArrayList;
import model.Task;

public class TaskManager {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}