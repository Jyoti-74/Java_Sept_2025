import java.util.Scanner;
public class TablePrinter_29 {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number to print it's multiplication table:");
        int num= sc.nextInt();

        System.out.println("Multiplication table of " + num +":");

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = "+ num*i);
        }

        sc.close();
    }
}