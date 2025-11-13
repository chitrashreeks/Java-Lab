import java.util.Scanner;

class Marks {
    String usn, name;
    int[] credits;
    int[] marks;
    int n;

    void acceptDetails(Scanner sc) {
        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter USN:");
        usn = sc.nextLine();

        System.out.println("Enter number of subjects:");
        n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        credits = new int[n];
        marks = new int[n];

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter credits for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print("Credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }
    }

    double calculateSGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < n; i++) {
            int gradePoint;

            if (marks[i] >= 90)
                gradePoint = 10;
            else if (marks[i] >= 80)
                gradePoint = 9;
            else if (marks[i] >= 70)
                gradePoint = 8;
            else if (marks[i] >= 60)
                gradePoint = 7;
            else if (marks[i] >= 50)
                gradePoint = 6;
            else if (marks[i] >= 40)
                gradePoint = 5;
            else
                gradePoint = 0;

            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        return totalPoints / totalCredits;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", calculateSGPA());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Marks s = new Marks();
        s.acceptDetails(sc);
        s.displayDetails();
        sc.close();
    }
}
