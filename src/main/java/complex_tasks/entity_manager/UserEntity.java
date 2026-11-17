package complex_tasks.entity_manager;

public class UserEntity {

    private String name;
    private int age;
    private boolean isActive;

    public UserEntity(String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }
}
