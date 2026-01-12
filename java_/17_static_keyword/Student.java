
public class Student {

    private int age;

    public static int count = 0;

    // static block -  runs whenever class is called
    static {
        System.out.println("Hello");
    }

    public Student() {
        count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

