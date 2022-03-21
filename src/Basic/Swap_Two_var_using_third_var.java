package Basic;

import java.util.Scanner;

public class Swap_Two_var_using_third_var {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A :: ");
        int A = input.nextInt();
        System.out.print("Enter the value of B :: ");
        int B = input.nextInt();
        System.out.println("Before Swaping");
        System.out.println("Your A value :: " + A + " Your B value :: " + B);
        int temp = 0 ;
        temp = A;
        A = B;
        B = temp;
        System.out.println("After Swaping");
        System.out.println("Your A value :: " + A + " Your B value :: " + B);


    }


}
