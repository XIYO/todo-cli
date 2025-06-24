public class Todo {
    private int id;
    private String description;
    private boolean completed;

    public Todo(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return String.format("%d. [%s] %s", id, completed ? "x" : " ", description);
    }
}
