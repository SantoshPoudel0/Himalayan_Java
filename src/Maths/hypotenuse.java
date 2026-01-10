package Maths;

import java.util.Scanner;

public class hypotenuse {

    // hypotenuse c = Math.sqrt ( a2 + b2)
    // Right angle triangle question ........

    public static void main(String[] args) {
         Scanner scanner =new Scanner(System.in);

            double a;
            double b;
            double c;

            System.out.print("Enter the length of side A: ");
            a = scanner.nextDouble();
            System.out.print("Enter the length of side B: ");
            b = scanner.nextDouble();
            c = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));
             scanner.close();

        System.out.println("The hypotenuse of ( Side C ) is " + c + "cm");
    }
}
