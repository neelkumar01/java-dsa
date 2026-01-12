
public class Main {

    public static void main(String[] args) {
        
        // static - for memory management

        // the thing on which static is used directly belongs to class instead of instance of class


        Student boy = new Student();
        Student girl = new Student();

        boy.setAge(12);

        System.out.println(Student.count);
    }
}