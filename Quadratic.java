import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double disc, r1, r2;

        System.out.println("Enter values of a, b, c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // Calculate discriminant
        disc = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Not a quadratic equation (a cannot be zero).");
        } else {
            if (disc == 0) {
                System.out.println("Roots are real and equal.");
                r1 = -b / (2 * a);
                System.out.println("Root1 = Root2 = " + r1);
            } else if (disc > 0) {
                System.out.println("Roots are real and distinct.");
                r1 = (-b + Math.sqrt(disc)) / (2 * a);
                r2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.println("Root1 = " + r1 + " , Root2 = " + r2);
            } else {
                System.out.println("Roots are imaginary (no real roots).");
            }
        }
        sc.close();
    }
}