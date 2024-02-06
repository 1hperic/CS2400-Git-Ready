public class Student{
    private String studentName;
    private double studentGPA;

    public Student(String studentName, double studentGPA){
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }

    public String getName(){
        return this.studentName;
    }

    public void setName(String studentName){
        this.studentName = studentName;
    }

    public double getGPA(){
        return this.studentGPA;
    }

    public void setGPA(double studentGPA){
        this.studentGPA = studentGPA;
    }

}

