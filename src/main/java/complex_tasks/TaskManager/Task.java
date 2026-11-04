package complex_tasks.TaskManager;

import java.time.LocalDate;

public class Task<T> {
    private final T ID;
    private Status status;
    private final Priority priority;
    private final LocalDate date;

    public Task(T ID, Priority priority) {
        this.ID = ID;
        this.status = Status.TO_DO;
        this.date = LocalDate.now();
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

    public LocalDate getDate() {
        return date;
    }
}
