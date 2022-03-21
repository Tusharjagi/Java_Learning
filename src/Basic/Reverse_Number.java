package Basic;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number :: ");
        int n = input.nextInt();
        int temp ,rev =0;

        while (n != 0)
        {
            temp = n%10 ;
            rev = rev *10 +temp;
            n = n/10;

        }
        System.out.println("Reverse number :: "+rev);





    }

}
