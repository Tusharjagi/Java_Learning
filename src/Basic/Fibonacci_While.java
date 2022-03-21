package Basic;

import java.util.Scanner;

public class Fibonacci_While {
    public static void main(String[] args)
    {
        System.out.print("Enter How many series you want :: ");
        Scanner input = new Scanner(System.in);
        int ser = input.nextInt();
        int first= 0 , second= 1 , next;

        int i = 1;
        while (ser >= i)
        {
            next = first + second;
            System.out.print(first + " ");
            first = second;
            second = next;
            i++;

        }
    }
}
