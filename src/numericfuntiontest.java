import java.util.Scanner;
public class numericfuntiontest {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input a number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("OOP, thats not a number, exiting the program now....");
                break;
            }
        int val = scanner.nextInt();
        System.out.println("Is " + val + " an even number? " + (NumericFunctions.isEven(val) ? "Yes." : "No."));
        System.out.println("Is " + val+ " a positive number? " + (NumericFunctions.isPos    (val) ? "Yes." : "No."));
        System.out.println("Is " + val + " a Fibonacci number? " + (NumericFunctions.isFib(val) ? "Yes." : "No."));
          System.out.println("Is " + val +" a power of two? " + (NumericFunctions.isPOtwo(val) ? "Yes." : "No."));
        System.out.println("Is " + val + " a prime number? " + (NumericFunctions.isPrm(val) ? "Yes." : "No."));
         System.out.println("Is " + val+ " a square number? " + (NumericFunctions.isSqr(val) ? "Yes." : "No."));
        }
        scanner.close();
    }

}
