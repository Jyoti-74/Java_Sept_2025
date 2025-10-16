import java.util.Scanner; 

public class ArmstrongNumber_26{ 

    public static void main(String [] args){ 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter  number:"); 
        int num = sc.nextInt(); 

        int original = num; 
        int sum = 0; 
        int digits = 0; 


        // step-1 Count num of digits 
        int temp = num; 
        do {
            digits++;
            temp = temp / 10;
        } while (temp > 0);

        //step-2 Calculate sum of each digit raised to the power 'digits'
        temp = num; 
        do {
            int digit = temp % 10; 

            //find power of digit 
            int power = 1; 
            for(int i = 0; i < digits; i++){ 
                power *= digit; 
            } 
            sum += power; 
            temp = temp / 10; 
        } while (temp > 0);

        // step-3 Compare sum with original number 
        if(sum == original){ 
            System.out.println(original + " is an Armstrong number."); 
        }else{ 
            System.out.println(original + " is not an Armstrong number."); 
        } 

        sc.close();
    } 
}