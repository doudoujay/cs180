import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jay on 2017/3/3.
 */
public class Student extends Person {
    private String[] courses;
    private int numCourse = 0;
    private char[] grades;

    Student(String name, String address) {
        super(name, address);
        courses = new String[] {"none","none","none","none","none","none"};
        grades = new char[]{'A','A','A','A','A','A'};
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public char[] getGrades() {
        return grades;
    }

    public void setGrades(char[] grades) {
        this.grades = grades;
    }

    public boolean addCourse(String course) {
        ArrayList<String> coursesList = new ArrayList<String>(Arrays.asList(courses));
        boolean contained = coursesList.contains(course);
        if (!contained && numCourse < 6){
            courses[numCourse] = course;
            numCourse++;
            return true;
        }
        return false;
    }
    public int arraySizeHelper(ArrayList<String> list){
        int result = 0;
        for (String a:list){
            if (a != null)
                result++;
        }
        return result;
    }
}
