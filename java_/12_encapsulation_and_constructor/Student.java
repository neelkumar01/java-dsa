
public class Student {

    private String name;
    private int age;
    private int rollnum;

    // custom constructor & overloading our default constructor

    public Student() {
        this.age = 18;
    }


    // getters and setters

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}