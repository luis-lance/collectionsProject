package grades;

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

}
