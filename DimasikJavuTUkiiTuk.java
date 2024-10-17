import java.util.Scanner;

//privet)))

public class DimasikJavuTUkiiTuk {
 public static double calculateFunction(int x, double a, double b) {
     double result = Double.NaN;

        //Tut koroche if
        if (x >= 1 && x <= 3) {
            switch (x) {
                case 1:
                case 2:  
                    result = 9 / (a * x);
                    break;
                case 3:  
                    result = (a * x * x + x + b) / x;
                    break;
                default:
                    result = Double.NaN;
            }
        } else {
            System.out.println(" znach x [1, 3]");
        }

        return result;
    }
    //Zavadannya 2
    public static int countSentencesUsingWhile(String text) {
        int count = 0;
        int i = 0;
        String sentenceEndings = ".!?";

        while (i < text.length()) {
            if (sentenceEndings.indexOf(text.charAt(i)) != -1) {
                count++;
            }
            i++;
        }

        return count;
    }

    public static int countSentencesUsingDoWhile(String text) {
        int count = 0;
        int i = 0;
        String sentenceEndings = ".!?";

        
        if (text.length() > 0) {
            do {
                if (sentenceEndings.indexOf(text.charAt(i)) != -1) {
                    count++;
                }
                i++;
            } while (i < text.length());
        }

        return count;
    }

    //zavdannya 3
    public static void printRangeWithoutMultiples(int start, int end, int primeNumber) {
        for (int number = start; number <= end; number++) {
            if (number % primeNumber == 0) {
                continue; 
            }
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //zavdannya 1
        System.out.println("zadanie 1: reshayem funciyu f(x)");
        System.out.print("input a: ");
        double a = scanner.nextDouble();
        System.out.print("input b: ");
        double b = scanner.nextDouble();
        System.out.print("input x (1, 2 or 3): ");
        int x = scanner.nextInt();
        double result = calculateFunction(x, a, b);
        if (!Double.isNaN(result)) {
            System.out.println("result: " + result);
        }

        //Prodovzhenya zavdannya 2
        scanner.nextLine();  
        System.out.println("\nzadanie 2: tut mi podshchitivayem skolko rechen");
        System.out.print("vvedi text: ");
        String text = scanner.nextLine();
        
        int sentenceCountWhile = countSentencesUsingWhile(text);
        System.out.println("kol rechen: " + sentenceCountWhile);
        
        int sentenceCountDoWhile = countSentencesUsingDoWhile(text);
        System.out.println("Кol rechen: " + sentenceCountDoWhile);

        System.out.println("\nzadanie3: inputni diapazon chisel");
        System.out.print("inputni pochatkovi diapazon: ");
        int start = scanner.nextInt();
        System.out.print("inputni pkonechniy diapazon: ");
        int end = scanner.nextInt();
        System.out.print("inputni simple cifru (from 1 to 9): ");
        int primeNumber = scanner.nextInt();
        if (primeNumber == 2 || primeNumber == 3 || primeNumber == 5 || primeNumber == 7) {
            System.out.print("chisla v diapazone (" + start + " - " + end + "), yaki ne kratni " + primeNumber + ": ");
            printRangeWithoutMultiples(start, end, primeNumber);
        } else {
            System.out.println("input simple chislo.");
        }

        scanner.close();
    }
}
