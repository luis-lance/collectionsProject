package grades;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name: '" + name + '\'' +
                ", grades: " + grades +
                '}';
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
//        Student luis = new Student("luis");
//        luis.addGrade(99);
//        System.out.println(luis.grades);
//        System.out.println(luis);
    }

    public boolean willContinue(String prompt){
        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        if(response.equalsIgnoreCase("yes")|| response.equalsIgnoreCase("y")){
            System.out.println("What student would you like to see information on");

        } else if (response.equalsIgnoreCase("no")|| response.equalsIgnoreCase("n")){
            System.out.println("Goodbye, have a wonderful day!");

        }
        return false;
    }
}
