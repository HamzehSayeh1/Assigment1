public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student student1 = new Student(1, "John Doe", "john@example.com");
        Student student2 = new Student(2, "Jane Smith", "jane@example.com");

        Course course1 = new Course(1, "Introduction to Computer Science", "Prof. Smith", 30);
        Course course2 = new Course(2, "Calculus 101", "Prof. Johnson", 25);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addCourse(course1);
        university.addCourse(course2);

        university.enrollStudentIntoCourse(student1, course1);
        university.enrollStudentIntoCourse(student2, course1);
        university.enrollStudentIntoCourse(student1, course2);

        university.generateStudentEnrolledCoursesReport(student1);
        university.generateCoursesEnrolledStudentsReport(course1);

        university.dropStudentFromCourse(student1, course1);

        university.generateStudentEnrolledCoursesReport(student1);
        university.generateCoursesEnrolledStudentsReport(course1);

    }
}