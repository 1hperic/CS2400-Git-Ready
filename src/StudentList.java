import java.util.Scanner;
import java.util.ArrayList;

public class StudentList{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        String name = "";
        double GPA = 0;
        boolean flag = true;

        while(flag){
            System.out.print("Input student name ('q' to quit): ");
            name = input.nextLine();
            if(name.equalsIgnoreCase("q")){
                flag = false;
                break;
            }

            System.out.print("Input student GPA : ");
            GPA = input.nextDouble();
            input.nextLine(); //clear input buffer

            students.add(new Student(name, GPA));
            System.out.println("Student added. ");

        }

        for(int i = 0; i < students.size(); i++){
            System.out.println("Name: " + students.get(i).getName() + ", GPA: " + students.get(i).getGPA());
        }

        input.close();

    }
    

}