package complex_tasks.TaskManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskService<T> {
    private final List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        if (tasks.stream().anyMatch(t -> t.getID().equals(task.getID()))) {
            throw new IllegalArgumentException("Задача с таким ID существует");
        }

        tasks.add(task);
    }

    public synchronized boolean removeTask(T id) {
        return tasks.removeIf(task -> task.getID().equals(id));
    }

    public synchronized List<Task<T>> getTasksByStatus(Status status) {
        return tasks.stream()
                .filter(task -> task.getStatus() == status)
                .toList();
    }

    public synchronized List<Task<T>> getTasksByPriority(Priority priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == priority)
                .toList();
    }

    public synchronized List<Task<T>> getSortedTasksByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .toList();
    }

}
