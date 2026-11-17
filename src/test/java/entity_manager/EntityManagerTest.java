package entity_manager;

import complex_tasks.entity_manager.EntityManager;
import complex_tasks.entity_manager.UserEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    @Test
    void EntityManager_get() {
        EntityManager<UserEntity> manager = new EntityManager<>();
        UserEntity user = new UserEntity("Bill", 20, true);
        manager.addEntity(user);

        assertEquals(1, manager.getAllEntities().size());
    }

    @Test
    void EntityManager_remove() {
        EntityManager<UserEntity> manager = new EntityManager<>();
        UserEntity user = new UserEntity("Bill", 20, true);
        manager.addEntity(user);

        assertTrue(manager.removeEntity(user));
        assertFalse(manager.removeEntity(user));
    }

    @Test
    void EntityManager_filterByName() {
        EntityManager<UserEntity> manager = new EntityManager<>();
        UserEntity user1 = new UserEntity("Bill", 20, true);
        UserEntity user2 = new UserEntity("Bill", 10, true);
        UserEntity user3 = new UserEntity("John", 40, true);
        manager.addEntity(user1);
        manager.addEntity(user2);
        manager.addEntity(user3);

        assertEquals(2, manager.filterByName("Bill").size());
    }

    @Test
    void EntityManager_filterByAge() {
        EntityManager<UserEntity> manager = new EntityManager<>();
        UserEntity user1 = new UserEntity("Bill", 20, true);
        UserEntity user2 = new UserEntity("Bill", 10, true);
        UserEntity user3 = new UserEntity("John", 40, true);
        manager.addEntity(user1);
        manager.addEntity(user2);
        manager.addEntity(user3);

        assertEquals(2, manager.filterByAge(10, 25).size());
    }

    @Test
    void EntityManager_filterByActive() {
        EntityManager<UserEntity> manager = new EntityManager<>();
        UserEntity user1 = new UserEntity("Bill", 20, true);
        UserEntity user2 = new UserEntity("Bill", 10, false);
        UserEntity user3 = new UserEntity("John", 40, true);
        manager.addEntity(user1);
        manager.addEntity(user2);
        manager.addEntity(user3);

        assertEquals(2, manager.filterByActivity(true).size());
    }
}
