package Basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int check = n;
        int temp , rev = 0;
        while (n !=0)
        {
            temp = n%10;
            rev = rev * 10 + temp;
            n = n/10;
        }
        if (rev == check)
        {
            System.out.println("This is palindrome");
        }
        else
        {
            System.out.println("This is not a palindrome");
        }
    }

}
