/**
 * Created by jay on 2017/3/3.
 */
public class Professor extends Person {
    private double salary;
    private String course;
    private String rank;


    Professor(String name, String address, String course, String rank) {
        super(name, address);
        this.course = course;
        this.rank = rank;
        if(rank.equals("Assistant"))
            this.salary = 70000;
        if(rank.equals("Professor"))
            this.salary = 100000;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {

        this.rank = rank;
        if(rank.equals("Assistant"))
            this.salary = 70000;
        if(rank.equals("Professor"))
            this.salary = 100000;
    }
}
