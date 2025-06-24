import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<Todo> todos = new ArrayList<>();
    private int nextId = 1;

    public void add(String description) {
        todos.add(new Todo(nextId++, description));
    }

    public List<Todo> getAll() {
        return todos;
    }

    public Todo find(int id) {
        return todos.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean remove(int id) {
        return todos.removeIf(t -> t.getId() == id);
    }
}
