package grades;

import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, String> students = new HashMap<>();

    public static void main(String[] args) {


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

        students.put("lance", "glitch78");
        students.put("luis", "luis210");
        students.put("alex", "alex098");
        students.put("bob", "bobs123");


        System.out.printf("Welcome!\nHere are the github usernames of our students:\n| %s |   | %s |   | %s |   | %s |\n\n", students.get("lance"), students.get("luis"), students.get("alex"), students.get("bob"));
        do {
            System.out.println("What student would you like to see more information on?");
            String response = input.nextLine();
            for (Map.Students<String, String> e : hashmap.entrySet()) {
                String key = e.getKey();
                String value = e.getValue();
            }
            if (students.containsValue(response)) {
                System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %f\n\n", students.get("lance"), students.values(), lance.getGradeAverage());
            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("Goodbye, and have a wonderful day!");
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\"\n\n", response);
            }
        } while (willContinue("Would you like to see another student?"));
        System.out.println("Goodbye, and have a wonderful day!");
    }

    public static boolean willContinue(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        String response = input.nextLine();
        if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        } else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {

            return false;
        }
        return false;
    }

}
