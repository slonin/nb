package exceptions_generics;

public class Storage<T> {
    private T elem;

    Storage(T elem) {
        this.elem = elem;
    }

    public T getElement() {
        return elem;
    }
}
