package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, String> students = new HashMap<>();

    public static void main(String[] args) {
        boolean willContinue = true;

        Scanner input = new Scanner(System.in);

        Student lance = new Student("Lance");
        lance.addGrade(99);
        lance.addGrade(45);
        lance.addGrade(71);

        Student luis = new Student("luis");
        luis.addGrade(100);
        luis.addGrade(65);
        luis.addGrade(83);

        Student alex = new Student("alex");
        alex.addGrade(77);
        alex.addGrade(89);
        alex.addGrade(91);

        Student bob = new Student("bob");
        bob.addGrade(88);
        bob.addGrade(66);
        bob.addGrade(55);

        students.put("lance", " @glitch78");
        students.put("luis", " @luisdelgado373");
        students.put("alex", " @alex098");
        students.put("bob", " @bobs123");

        System.out.printf("Welcome!\nHere are the github usernames of our students:\n| %s |\t| %s |\t| %s |\t| %s |\n\n", students.get("lance"), students.get("luis"), students.get("alex"), students.get("bob"));
        System.out.println("What student would you like to see more information on?");
        do {
            String response = input.nextLine();
            if (response.equalsIgnoreCase("glitch78")) {
                System.out.printf("Name: Lance - GitHub Username: @glitch78\nCurrent Average: %f\n\nWould you like to see another student?", lance.getGradeAverage());
            } else if (response.equalsIgnoreCase("luis210")) {
                System.out.printf("Name: Luis - GitHub Username: @luis210\nCurrent Average: %f\n\nWould you like to see another student?", luis.getGradeAverage());
            } else if (response.equalsIgnoreCase("alex098")) {
                System.out.printf("Name: Alex - GitHub Username: @alex098\nCurrent Average: %f\n\nWould you like to see another student?", alex.getGradeAverage());
            } else if (response.equalsIgnoreCase("bobs123")) {
                System.out.printf("Name: Bob - GitHub Username: @bobs123\nCurrent Average: %f\n\nWould you like to see another student?", bob.getGradeAverage());
            } else if (response.equalsIgnoreCase("no")) {
                willContinue = false;
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\"\nWould you like to see another student?\n", response);
            }
        } while(willContinue);

    }

}
