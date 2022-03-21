package Basic;

public class Fibonacci {

    public static void main(String[] args) {
        int first = 0, second = 1, next, i, count = 10;
        System.out.print(first + " " + second);

        for (i = 2; i < count; ++i) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;


        }


    }

}
