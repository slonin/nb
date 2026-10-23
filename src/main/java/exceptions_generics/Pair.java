package exceptions_generics;

public class Pair<T, K> {
    private T firstElem;
    private K secondElem;

    public T getFirstElem() {
        return firstElem;
    }

    public K getSecondElem() {
        return secondElem;
    }

    public void setFirstElem(T elem) {
        this.firstElem = elem;
    }

    public void setSecondElem(K elem) {
        this.secondElem = elem;
    }
}
