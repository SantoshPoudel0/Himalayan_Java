import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill The Form Before Watching Movie");
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.print("Did you have Mobile Phone ? ( true / false ) ");
        boolean phone = scanner.nextBoolean();
        scanner.nextLine();
        if (phone) {
            System.out.print("Enter your mobile number:");
            String mobile = scanner.nextLine();
            System.out.println("Hello " + name);
            System.out.println("Your Age is " + age);
            System.out.println("Your mobile number is " + mobile);
        } else {
            System.out.println("Hello " + name);
            System.out.println("Your age is " + age);
        }
        if (age >= 18 && phone) {


            System.out.println("Congrats! You are eligible to watch 18+ movie");
        } else {

            System.out.println("Sorry you not get the 18+ movie");
        }
    }
}
        /*
        boolean
         True False
         1 , 0

         */


