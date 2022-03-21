package Basic;

import java.util.Scanner;

public class Sum_of_digit {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        int n = input.nextInt();
        int temp, sum =0;
        while (n!=0)
        {
            temp = n%10;
            sum += temp;
            n = n/10;

        }
        System.out.println("Sum of those number is :: "+sum);

    }

}
