package model;

public class PriorityTask extends Task {
    private final String priority;

    public PriorityTask(String title, String priority) {
        super(title);
        this.priority = priority;
    }

    @Override
    public void display() {
        System.out.println(title + " [" + priority + "]");
    }
}