
public class StringContainer implements Container<String> {

    private String name;

    @Override
    public void add(String name) {
        this.name = name;
    }

    @Override
    public String get() {
        return name;
    }
}