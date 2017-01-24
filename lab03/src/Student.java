/**
 * CS180 - Lab 03
 * Student grading for lab 03
 * @author Ji Ma, ma438@purdue.edu, L08
 */
public class Student {
    private String id;
    private String dept;
    private int part;
    private int abs;
    private int exam;

    public Student(String id, String dept,int abs,int exam,int part){
        this.id = id;
        this.dept = dept;
        this.part = part;
        this.abs = abs;
        this.exam = exam;
    }

    public String getId(){
        return this.id;
    }

    public int getOverallScore(){
        int totScore = 0;
        int attendanceScore = 0;
        if (this.abs == 0){
            attendanceScore = 2;
        }

        totScore = this.exam +this.part + attendanceScore;
        return totScore;
    }

    public String getLetterGrade(int score){
        String letterGrade = "";
        if(this.abs >= 5 || score < 60){
//            Fail
            letterGrade = "F";
        }
        else if(score < 70){
            letterGrade = "D";
        }
        else if (score < 80){
            letterGrade = "C";
        }
        else if (score < 90){
            letterGrade = "B";
        }
        else if (score < 95){
            letterGrade = "A";
        }
        else if (score <= 100){
            letterGrade = "A+";
        }

        return letterGrade;
    }

    public boolean hasPassedCourse(String letterGrade){
        boolean result = false;
        if (this.dept == "CS"){
            result = (letterGrade != "F");
        }
        else if (this.dept == "PHI"){
            result = (letterGrade == "A" || letterGrade == "B");
        }
        return result;
    }

    public static void main(String[] args){
        Student s = new Student("1020109","CS",5,95,5);
        int totScore = s.getOverallScore();
        String grade = s.getLetterGrade(totScore);
        boolean result = s.hasPassedCourse(grade);
        System.out.println(s.getId());
        System.out.println("Score: "+totScore);
        System.out.println("Grade: "+ grade);
        if (result){
            System.out.println("Student "+ s.getId()+" has passed the course");
        }else {
            System.out.println("Student "+ s.getId()+" has failed the course");
        }
        
    }
}
