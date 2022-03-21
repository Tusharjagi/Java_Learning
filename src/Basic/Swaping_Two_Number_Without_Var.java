package Basic;

import java.util.Scanner;

public class Swaping_Two_Number_Without_Var {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A :: ");
        int A = input.nextInt();
        System.out.print("Enter the value of B :: ");
        int B = input.nextInt();
        System.out.println("Before Swaping");
        System.out.println("Your A value :: " + A + " Your B value :: " + B);
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("After Swaping");
        System.out.println("Your A value :: " + A + " Your B value :: " + B);


    }
}
