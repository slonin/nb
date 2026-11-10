package complex_tasks.TaskManager;

import java.time.LocalDateTime;

public class Task<T> {
    private final T ID;
    private Status status;
    private final Priority priority;
    private final LocalDateTime date;

    public Task(T ID, Priority priority) {
        this.ID = ID;
        this.status = Status.TO_DO;
        this.date = LocalDateTime.now();
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public T getID() {
        return ID;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
