package exceptions_generics;

public interface Container<T> {
    void add(T item);

    T get();
}
