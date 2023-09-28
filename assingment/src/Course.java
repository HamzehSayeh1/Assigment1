import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseCode;
    private String courseTitle;
    private String courseInstructor;
    private int maximumCapacity;
    private List<Student> enrolledStudents;
    public Course(int code,String courseTitle,String instructor,int maximumCapacity){
        this.courseCode=code;
        this.courseTitle=courseTitle;
        this.courseInstructor=instructor;
        this.maximumCapacity=maximumCapacity;
        this.enrolledStudents=new ArrayList<>();
    }
    public int getCourseCode(){
        return courseCode;
    }
    public void setCourseCode(int code){
        this.courseCode=code;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public List<Student> getEnrolledStudents(){
        return enrolledStudents;
    }

    public void enrollStudent(Student student){
        if(enrolledStudents.size()<maximumCapacity) {
            enrolledStudents.add(student);
        }

        else
            System.out.println("Course has reached maximum capacity");
    }
    public void dropStudent(Student student){
            enrolledStudents.remove(student);
    }
    public boolean isFull(){
        return enrolledStudents.size()>=maximumCapacity;
    }
}
