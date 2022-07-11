package demo2;

public class Generic<T> { //T为泛型标识   之后创建对象的时候要指定类型  T之后是String类型。。。
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
