package service;

import model.Task;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void viewTasks() {
        for (Task t : tasks) {
            t.display();
        }
    }
}