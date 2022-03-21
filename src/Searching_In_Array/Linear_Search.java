package Searching_In_Array;

import java.util.Scanner;

public class Linear_Search {
    public static int Linearsearch(int[] arr, int key,int size)
    {
        for (int i = 0; i < size;i++)
        {
            if (arr[i] == key )
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int [] arr= {10,20,30,40,50,60,70};
        System.out.println("Enter the element you want to search");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        int size = arr.length;
        System.out.println("Found at Index number :: " + Linearsearch(arr,key,size));
    }
}
