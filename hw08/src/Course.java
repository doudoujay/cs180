/**
 * Created by jay on 3/3/17.
 */
public class Course {
    private Professor professor;
    private Student[] students;
    private String courseName;
    private int numEnrolled;

    Course(Professor professor, String courseName) {
        this.professor = professor;
        this.courseName = courseName;
        this.students = new Student[100];
        this.numEnrolled = 0;
    }

    boolean enroll(Student s) {
        /*The course is not full
        The student successfully adds the course
        This method returns true if they are successfully enrolled, and returns false otherwise*/
        if (getLength(this.students) < 100){
            if(s.addCourse(this.courseName)){
                students[numEnrolled] = s;
                numEnrolled++;
                return true;
            }
        }
        return false;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumEnrolled() {
        return numEnrolled;
    }

    public void setNumEnrolled(int numEnrolled) {
        this.numEnrolled = numEnrolled;
    }

    public static void main(String[] args) {
        String courseName = "MA16200";
        Professor p = new Professor("Dr. Malcom", "MATH", courseName, "Professor");
        Course c = new Course(p, courseName);          // creates a new Course

        Student s = new Student("Bobby Jones", "Earhart Hall");  // Creates new Student

        System.out.println(s.getCourses()[0]);              // prints "none"
        System.out.println(c.enroll(s));                    // prints "true"
        System.out.println(s.getCourses()[0]);              // prints "MA16200"
        System.out.println(c.getStudents()[0].getName());   // prints "Bobby Jones"
        System.out.println(c.getProfessor().getName());     // prints "Dr. Malcom"
    }
    public static <T> int getLength(T[] arr){
        int count = 0;
        for(T el : arr)
            if (el != null)
                ++count;
        return count;
    }
}
