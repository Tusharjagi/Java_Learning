package Basic;

import java.util.Scanner;

public class Odd_Even {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive number :: ");
        int a = input.nextInt();

        if (a%2 ==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }


    }
}
