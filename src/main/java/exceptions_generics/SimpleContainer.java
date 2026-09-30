package exceptions_generics;

public class SimpleContainer<T> implements Container<T> {
    private T elem;

    @Override
    public T get() {
        return this.elem;
    }

    @Override
    public void add(T elem) {
        this.elem = elem;
    }
}
