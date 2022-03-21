package Basic;

import java.util.Scanner;

public class factorial {
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any integer number :: ");
        int n = input.nextInt();
        int i = 1,fact=1;
        while (i<=n)
        {
            fact = fact*i;
            i++;
        }
        System.out.print("Factorial of this number :: " + fact);


    }
}
