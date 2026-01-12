
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Student {

    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("Neel", 8.3));
        students.add(new Student("Ram", 8.7));
        students.add(new Student("Krishna", 10));

        students.sort( (o1, o2) -> {                            // sorting logic - descending order of gpa
            if (o2.getGpa() - o1.getGpa() > 0) {
                return 1;
            }
            else if (o2.getGpa() - o1.getGpa() < 0) {
                return -1;
            }
            else {
                return 0;
            }
        });

        for (Student s: students) {
            System.out.println(s.getName() + " " + s.getGpa());
        }


        // using comparator class to write sorting logic

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
        students.sort(comparator);
        System.out.println();

        for (Student s: students) {
            System.out.println(s.getName() + " " + s.getGpa());
        }
    }
}