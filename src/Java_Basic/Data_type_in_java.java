package Java_Basic;

import java.util.Scanner;

class Data_type_in_java {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.println("You Enter the " + number);

        System.out.print("Enter float value :: ");
        float myFloat = input.nextFloat();
        System.out.println("Your Float value" + myFloat);

        System.out.print("Enter double value :: ");
        double myDouble = input.nextDouble();
        System.out.println("your Double value" + myDouble);

        System.out.print("Enter the any string :: ");
        String myString = input.next();
        System.out.println("Your String "+myString);

    }

}
