package Basic;

import java.util.Scanner;

public class Adding_Two_Number {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first value :: ");
        int Num1= input.nextInt();
        System.out.print("Enter the second value :: ");
        int Num2 = input.nextInt();
        int sum = Num1 + Num2;
        System.out.println("Sum of two numbers :: " + sum);
    }
}
