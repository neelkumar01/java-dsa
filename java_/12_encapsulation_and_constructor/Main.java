public class Main {

    public static void main(String[] args) {
        
        Student student = new Student();

        // encapsulation - to hide data

        student.setAge(18);
        int age = student.getAge();

        System.out.println(age);


        Student boy = new Student();        // Student()  --->  default constructor


        Cat cat = new Cat("kitty", "street cat", "black");

    }
}