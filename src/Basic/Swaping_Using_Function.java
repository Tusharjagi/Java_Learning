package Basic;


import java.util.Scanner;

public class Swaping_Using_Function {
    int a;
    int b;


    public void swap(Swaping_Using_Function swaping) {
        int temp;
        temp = swaping.a;
        swaping.a = swaping.b;
        swaping.b = temp;
    }

    public static void main(String[] args) {
        Swaping_Using_Function suf = new Swaping_Using_Function();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first value :: ");
        suf.a = input.nextInt();
        System.out.print("Enter the second value :: ");
        suf.b = input.nextInt();
        System.out.println("Before Swaping");

        System.out.println("After swaping value");
        System.out.println("Your value of First and Second " + suf.a + " AND " + suf.b);


    }
}
