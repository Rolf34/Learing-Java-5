import java.util.Scanner;

public class zadaniyeDimasas2JavaTukiTUK{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for a, b, and x
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();

        // Calculate f(x) based on the conditions
        double fx = 0;
        
        if (x >= 0 && x < 5) {
            fx = Math.cos(x); // f(x) = cos(x) for x in [0, 5)
        } else if (x == 5) {
            double sqrtValue = Math.sqrt(a * x - b);
            if (sqrtValue != 0) {
                fx = 1 / sqrtValue; // f(x) = (sqrt(ax - b))^-1 for x = 5
            } else {
                System.out.println("Undefined value for f(x) at x = 5 (division by zero).");
                return;
            }
        } else if (x > 5 && x <= 8) {
            fx = b * x * x + 3 * x - 2; // f(x) = bx^2 + 3x - 2 for x in (5, 8]
        } else {
            System.out.println("x is out of the defined range.");
            return;
        }

        // Output the result
        System.out.println("f(x) = " + fx);
        
        scanner.close();
    }
}
