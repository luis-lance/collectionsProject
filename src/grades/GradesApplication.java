package grades;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, String> students = new HashMap<>();

    public static void main(String[] args) {

        Student lance = new Student("Lance");
        lance.addGrade(99);
        lance.addGrade(45);
        lance.addGrade(71);
        lance.addGrade(83);

        Student luis = new Student("luis");
        luis.addGrade(100);
        luis.addGrade(65);
        luis.addGrade(83);
        luis.addGrade(77);

        System.out.println(luis.grades);
        System.out.println(luis);


        students.put("lellis", "lance");
    }


}
