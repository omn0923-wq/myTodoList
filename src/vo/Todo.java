package vo;

public class Todo {
    private String time;
    private String task;
    private boolean completed;

    public Todo() {
    }

    public Todo(String time, String task, boolean completed) {
        this.time = time;
        this.task = task;
        this.completed = completed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return time + " | " + task + " | " + (completed ? "완료" : "미완료");
    }
}