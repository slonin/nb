package exceptions_generics;

public class Box<T> {
    private T element;

    public void set(T element) {
        this.element = element;
    }

    public T get() {
        return this.element;
    }
}
