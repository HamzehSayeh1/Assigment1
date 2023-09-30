import java.util.ArrayList;
import java.util.List;

public class University {
   private List<Student> students;
   private List<Course> courses;
   public University(){
       students=new ArrayList<>();
       courses=new ArrayList<>();
   }
   public void addStudent(Student student){
       students.add(student);
   }
   public void addCourse(Course course){
       courses.add(course);
   }
   public void enrollStudentIntoCourse(Student student,Course course){
       if (students.contains(student) && courses.contains(course)){
           if(!course.isFull()){
               course.enrollStudent(student);
               student.enrollCourse(course);
           }
       }
       else
           System.out.println("student or course aren't found");
   }

   public void dropStudentFromCourse(Student student,Course course){
       if(students.contains(student) && courses.contains(course)){
           System.out.println("Student: "+student.getStudentName()+" removed From course: "+course.getCourseTitle());
           student.dropCourse(course);
           course.dropStudent(student);
       }
       else
           System.out.println("student or course aren't found");
   }

   //Reports
    public void generateUniversityCoursesReport(){
       System.out.println("University Courses");
      for (Course course:this.courses){
          int remainingCapacity=course.getMaximumCapacity()-course.getEnrolledStudents().size();
          System.out.println("Course Code: " + course.getCourseCode());
          System.out.println("Title: " + course.getCourseTitle());
          System.out.println("Instructor: " + course.getCourseInstructor());
          System.out.println("Current Capacity: " + courses.size());
          System.out.println("Remaining Capacity: " +remainingCapacity);
          System.out.println();
      }
    }
   public void generateStudentEnrolledCoursesReport(Student student){
       System.out.println("Enrolled courses for student: "+student.getStudentName());
       for(Course course:student.getEnrolledCourses()){
       System.out.print(course.getCourseCode()+" ");
       System.out.println(course.getCourseTitle());
       }
   }
   public void generateCoursesEnrolledStudentsReport(Course course){
       System.out.println("Students enrolled into course: "+course.getCourseTitle()) ;
       for(Student student:course.getEnrolledStudents()){
           System.out.print(student.getStudentId()+" ");
           System.out.println(student.getStudentName());
       }
   }
   public void generateOverallReport(){
       generateUniversityCoursesReport();
       generateCoursesEnrolledStudentsReport(courses.get(0));
       generateStudentEnrolledCoursesReport(students.get(0));
   }

}
