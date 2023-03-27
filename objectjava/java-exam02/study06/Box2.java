package study06;

public class Box2<T, E> {

    private T data;
    private E data2;

    public void set(T data, E data2) {

        this.data = data;
        this.data2 = data2;
    }

    public T get() {
        return this.data;
    }

    public E get2() {
        return this.data2;
    }
}
