import java.util.Scanner;

public class zadaniyeDimasas2JavaTukiTUK{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//KOrocheee mi tut vvodim danniye
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value for x: ");
        double x = scanner.nextDouble();

        double fx = 0;
        
        if (x >= 0 && x < 5) {
            fx = Math.cos(x); // tut matematika))) 
        } else if (x == 5) {
            double sqrtValue = Math.sqrt(a * x - b);
            if (sqrtValue != 0) {
                fx = 1 / sqrtValue; 
            } else {
                System.out.println("Undefined value for f(x) at x = 5 (division by zero).");
                return; //ksta tut takoy prikol, u menya dopolnenie zhaluetsa na return
            
            }
        } else if (x > 5 && x <= 8) {
            fx = b * x * x + 3 * x - 2; 
        } else {
            System.out.println("x is out of the defined range.");
            return;
        }
// nu tut mi vse znacheniya vivodatsya 
        System.out.println("f(x) = " + fx);
        
        scanner.close();
    }
}
// KSTATi ya mozhet budu perehodit na shtuchki ot JetBrains.. Kakiye dopolneniya posovetuyete?
