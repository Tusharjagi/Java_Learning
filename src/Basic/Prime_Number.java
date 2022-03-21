package Basic;

import java.util.Scanner;

public class Prime_Number {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any Integer Number :: ");
        int n = input.nextInt();
        int i ;
        if (n == 0 || n ==1)
        {
            System.out.println("Smallest prime number is 2");
        }
        for ( i = 2 ; i < n ; ++i )
        {
            if (n%i==0)
            {
                System.out.println("This not a prime number");
                break;
            }
        }
        if (n == i )
        {
            System.out.println("This is prime Number");
        }
    }

}
