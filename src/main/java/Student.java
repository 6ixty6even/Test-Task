import org.example.Main;

public class Student {

    int id;
    String name;
    String surname;
    int course;

    Student(int id1, String name1, String surname1, int course1) {
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
    }

    Student(String name2, String surname2) {
        this(0, name2, surname2, 0);
    }

    Student() {
    }
}

class StudentTest {

    static void equalization(Student st11, Student st22) {
        if (st11.name.equals(st22.name)) {
            System.out.println("Student are equal");
        } else {
            System.out.println("Student are not equal");
        }
    }

    static void equalParametersStudent(Student st1, Student st2) {
        if (st1.id > st2.id) {
            System.out.println(st1.name + " has more id");
        } else if (st1.id < st2.id) {
            System.out.println(st2.name + " has more id");
        } else if (st1.course > st2.course) {
            System.out.println(st1.course + " has more course");
        } else if (st1.course < st2.id) {
            System.out.println(st2.name + " has more course");
        } else {
            System.out.println("students equal");
        }
    }

    static void _equal2(Student st1, Student st2) {
        if (st1.id == st2.id) {
            if (st1.course == st2.course) {
                System.out.println("id and student course are equal");
            } else {
                System.out.println("id and student course are not equal");
            }
        } else {
            System.out.println("id student are not equal ||| but about course we dont have info because first if staetemant false last if statemante dont work ");
        }
    }
    //else - інше//

    public static void main(String[] args) {

        Student st1 = new Student(6, "Wean:", "Bean", 4);
        Student st2 = new Student(5, "John:", "Wood", 4);

        equalization(st1, st2);
        equalParametersStudent(st1, st2);
    }

}

