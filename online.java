import java.util.Scanner;

public class OnlineExamination {

    static Scanner sc = new Scanner(System.in);

    static String[] questions = {
        "Which language is mainly used for Android development?",
        "Which keyword is used to create a class in Java?",
        "Which method is the starting point of a Java program?",
        "Which data type is used to store decimal values?",
        "Which symbol is used to end a statement in Java?"
    };

    static String[][] options = {
        {"A. Java", "B. HTML", "C. CSS", "D. SQL"},
        {"A. function", "B. class", "C. define", "D. object"},
        {"A. start()", "B. run()", "C. main()", "D. begin()"},
        {"A. int", "B. char", "C. boolean", "D. double"},
        {"A. :", "B. .", "C. ;", "D. ,"}
    };

    static char[] correctAnswers = {'A', 'B', 'C', 'D', 'C'};

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     ONLINE EXAMINATION SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int score = 0;

        System.out.println("\nHello, " + name + "!");
        System.out.println("There are " + questions.length + " questions.");
        System.out.println("Each question carries 1 mark.\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("---------------------------------");
            System.out.println("Question " + (i + 1));
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == correctAnswers[i]) {
                score++;
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer!");
                System.out.println(
                    "Correct Answer: " + correctAnswers[i]
                );
            }
        }

        double percentage = ((double) score / questions.length) * 100;

        System.out.println("\n=================================");
        System.out.println("          EXAM RESULT");
        System.out.println("=================================");
        System.out.println("Student Name : " + name);
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers : " + (questions.length - score));
        System.out.println("Score : " + score + "/" + questions.length);
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 40) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

        System.out.println("=================================");

        sc.close();
    }
}
