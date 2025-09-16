import java.util.Scanner;

public class Sc_EvenOdd_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            if (a % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }

            System.out.print("Do you want to check another number? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Program ended.");
    }
}
