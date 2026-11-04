package complex_tasks.entity_manager;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EntityManager<T extends UserEntity> {
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void addEntity(T entity) {
        entities.add(entity);
    }

    public boolean removeEntity(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAllEntities() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int from, int to) {
        return entities.stream()
                .filter((entity) -> entity.getAge() >= from && entity.getAge() <= to)
                .toList();
    }

    public List<T> filterByName(String name) {
        return entities.stream()
                .filter((entity) -> entity.getName().equals(name))
                .toList();
    }

    public List<T> filterByActivity(boolean active) {
        return entities.stream()
                .filter((entity) -> entity.isActive() == active)
                .toList();
    }
}
