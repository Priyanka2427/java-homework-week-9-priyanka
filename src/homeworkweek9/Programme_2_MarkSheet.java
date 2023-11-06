package homeworkweek9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3
 * programmes) using if else and while loop.
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name:  ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();

        // Intialize variables for subject marks
        int mathMarks, scienceMarks, englishMarks;

        // Input marks for Math
        do {
            System.out.println("Enter Math marks (0-100) : ");
            mathMarks = sc.nextInt();
        } while (mathMarks < 0 || mathMarks > 100);

        // Input marks for Science
        do {
            System.out.println("Enter Science marks (0-100): ");
            scienceMarks = sc.nextInt();
        } while (scienceMarks < 0 || scienceMarks > 100);

        // Input marks for English
        do {
            System.out.println("Enter English marks (0-100): ");
            englishMarks = sc.nextInt();
        } while (englishMarks < 0 || englishMarks > 100);

        sc.close();

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks * 100.0) / 300;

        // Determine result and grade
        String result;
        String grade;

        if (percentage >= 80) {
            grade = "A+";
            result = "Pass";
        } else if (percentage >= 60) {
            grade = "A";
            result = "Pass";
        } else if (percentage >= 50) {
            grade = "B";
            result = "Pass";
        } else if (percentage >= 35) {
            grade = "C";
            result = "Pass";
        } else {
            grade = "N/A";
            result = "Fail";
        }

        // Print the Mark Sheet
        System.out.println("_____________________________");
        System.out.println("|                           |");
        System.out.println("|       Mark Sheet          |");
        System.out.println("|___________________________|");
        System.out.println("| Name : " + name);
        System.out.println("| Roll No: " + rollNo);
        System.out.println("|___________________________|");
        System.out.println("| Subjects :  Marks         |");
        System.out.println("|___________________________|");
        System.out.println("| Math : " + mathMarks);
        System.out.println("| Science : " + scienceMarks);
        System.out.println("| English : " + englishMarks);
        System.out.println("|___________________________|");
        System.out.println("| Total : " + totalMarks);
        System.out.println("|___________________________|");
        System.out.println("| Percentage : " + percentage);
        System.out.println("| Result : " + result);
        System.out.println("| Grade : " + grade);
        System.out.println("|___________________________|");
    }
}








