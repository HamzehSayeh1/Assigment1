import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private List<Course> enrolledCourses;
    public Student (int studentId,String name,String email){
        this.studentId=studentId;
        this.studentName=name;
        this.studentEmail=email;
        this.enrolledCourses=new ArrayList<>();
    }
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int id){
        this.studentId=id;
    }

    public String getStudentName(){
        return this.studentName;
    }
    public void setStudentName(String name){
        this.studentName=name;
    }
    public String getStudentEmail(){
        return this.studentEmail;
    }
    public void setStudentEmail(String email){
        this.studentEmail=email;
    }
    public List<Course> getEnrolledCourses(){

        return enrolledCourses;
    }
    public void enrollCourse(Course course){
        enrolledCourses.add(course);
    }
    public void dropCourse(Course course){
        enrolledCourses.remove(course);
    }
}
