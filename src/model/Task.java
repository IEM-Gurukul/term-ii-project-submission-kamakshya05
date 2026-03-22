package model;

public class Task {
    String title;
    public boolean isCompleted;

    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public void display() {
        System.out.println(title + " - " + (isCompleted ? "Done" : "Pending"));
    }

    public boolean isCompleted() {
    }
}