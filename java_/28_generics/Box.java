
public class Box<T> {           // implementing generic on class "Box"

    private T value;

    public Box(T value) {           // generic constructor
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

