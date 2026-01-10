package Maths;
import java.util.Scanner;
public class Circumference {

    // circumference = 2 * Math.PI * radius;
    // area of circle = Math.PI * Math.pow(radius, 2);
    // volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3)

    public  static void main(String [] args){




    Scanner scanner = new Scanner(System.in);
        double radius;
        double area;
        double circumference;
        double volume;



    System.out.print("Enter the radius of a circle: ");
    radius = scanner.nextDouble();
    area = Math.PI * Math.pow(radius, 2);

    volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius , 3);
    circumference = 2 * Math.PI * radius;
        System.out.printf("The area of the circle is: %.1fcm^3 \n" , area);
    System.out.printf("The circumference of the circle is: %.1fcm \n" , circumference );
    System.out.printf("The volume of the circle is: %.1fcm^3 \n" , volume);
    scanner.close();
    }
}
