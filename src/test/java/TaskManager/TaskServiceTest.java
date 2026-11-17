package TaskManager;

import complex_tasks.TaskManager.Priority;
import complex_tasks.TaskManager.Status;
import complex_tasks.TaskManager.Task;
import complex_tasks.TaskManager.TaskService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    @Test
    void taskManager_addTask() {
        TaskService<Integer> ts = new TaskService<>();
        ts.addTask(new Task<>(123, Priority.LOW));
        assertEquals(1, ts.getSortedTasksByDate().size());
    }

    @Test
    void taskManager_addSameTask() {
        TaskService<Integer> ts = new TaskService<>();
        ts.addTask(new Task<>(123, Priority.LOW));

        assertThrows(IllegalArgumentException.class, () -> ts.addTask(new Task<>(123, Priority.LOW)));
    }

    @Test
    void taskManager_removeTask() {
        TaskService<Integer> ts = new TaskService<>();
        ts.addTask(new Task<>(123, Priority.LOW));
        ts.removeTask(123);
        assertEquals(0, ts.getSortedTasksByDate().size());
    }

    @Test
    void taskManager_filterByPriority() {
        TaskService<Integer> ts = new TaskService<>();
        ts.addTask(new Task<>(123, Priority.LOW));
        ts.addTask(new Task<>(1234, Priority.HIGH));
        ts.addTask(new Task<>(12355, Priority.LOW));
        ts.addTask(new Task<>(123535, Priority.MEDIUM));

        assertEquals(2, ts.getTasksByPriority(Priority.LOW).size());
    }

    @Test
    void taskManager_filterByStatus() {
        TaskService<Integer> ts = new TaskService<>();
        Task<Integer> todoTask = new Task<>(123, Priority.LOW);
        Task<Integer> todoTask2 = new Task<>(13, Priority.MEDIUM);
        todoTask.setStatus(Status.IN_PROGRESS);
        todoTask2.setStatus(Status.IN_PROGRESS);
        ts.addTask(todoTask);
        ts.addTask(todoTask2);
        ts.addTask(new Task<>(12355, Priority.LOW));
        ts.addTask(new Task<>(123535, Priority.MEDIUM));


        assertEquals(2, ts.getTasksByStatus(Status.IN_PROGRESS).size());
    }

    @Test
    void taskManager_sortByDate() {
        TaskService<Integer> ts = new TaskService<>();
        ts.addTask(new Task<>(123, Priority.LOW));
        ts.addTask(new Task<>(1234, Priority.HIGH));
        ts.addTask(new Task<>(12355, Priority.LOW));
        ts.addTask(new Task<>(123535, Priority.MEDIUM));

        List<Task<Integer>> sorted = ts.getSortedTasksByDate();

        assertEquals(123, sorted.getFirst().getID());

    }


}
