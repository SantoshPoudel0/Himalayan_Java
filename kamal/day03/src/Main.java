//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Print numbers 1 to 10 (skip 5)");
            System.out.println("3. Reverse a number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // if-else
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0) {
                        System.out.println("Even Number");
                    } else {
                        System.out.println("Odd Number");
                    }
                    break;

                case 2:
                    // for loop + continue
                    System.out.println("Numbers from 1 to 10 (skip 5):");
                    for (int i = 1; i <= 10; i++) {
                        if (i == 5) {
                            continue;
                        }
                        System.out.println(i);
                    }
                    break;

                case 3:
                    // while loop
                    System.out.print("Enter a number to reverse: ");
                    int n = sc.nextInt();
                    int reverse = 0;

                    while (n != 0) {
                        int digit = n % 10;
                        reverse = reverse * 10 + digit;
                        n = n / 10;
                    }
                    System.out.println("Reversed number: " + reverse);
                    break;

                case 4:
                    // break
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4); // do-while loop

        sc.close();
    }
}
