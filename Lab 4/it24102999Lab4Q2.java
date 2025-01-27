import java.util.Scanner;

public class FinalMarkCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int examMarks = -1;
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Enter exam marks (0-100): ");
            examMarks = scanner.nextInt();
            if (examMarks < 0 || examMarks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }

        int labMarks = -1;
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Enter lab submission marks (0-100): ");
            labMarks = scanner.nextInt();
            if (labMarks < 0 || labMarks > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
            }
        }

        int examWeight = -1;
        int labWeight = -1;
        while (examWeight < 0 || labWeight < 0 || (examWeight + labWeight != 100)) {
            System.out.print("Enter percentage weight for exam marks (0-100): ");
            examWeight = scanner.nextInt();
            System.out.print("Enter percentage weight for lab submission marks (0-100): ");
            labWeight = scanner.nextInt();
            if (examWeight < 0 || labWeight < 0 || (examWeight + labWeight != 100)) {
                System.out.println("Invalid input. Percentages must be between 0 and 100 and must sum to 100.");
            }
        }

        double finalMark = (examMarks * examWeight / 100.0) + (labMarks * labWeight / 100.0);

        System.out.println("The final mark is: " + finalMark);

        scanner.close();
    }
}