package first;

import java.util.Scanner;

public class Addition {
    public static void main (String[] args) { //psvm intro i surt tot automatic

        System.out.println("Enter two numbers to make the sum: "); //sout

        final Scanner scanner = new Scanner(System.in);

        int a =scanner.nextInt();

        int b =scanner.nextInt();

        System.out.println("The sum is: " + sum(a, b));
    }

    private static int sum(int a, int b){
        return a+b;
    }
}
