package principles.lsp;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Воробей летит!");
    }
}
