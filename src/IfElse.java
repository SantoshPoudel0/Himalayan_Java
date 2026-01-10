import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age?: ");
        age = scanner.nextInt();

        if (age > 0 && age <= 3) {
            System.out.println("You are a baby");
        } else if (age > 3 && age <= 12) {
            System.out.println("You are a child");
        } else if (age > 12 && age < 18) {
            System.out.println("You are a teenager");
        } else if (age >= 18 && age < 40) {
            System.out.println("You are an adult");
        } else if (age >= 40) {
            System.out.println("You are a senior");
        } else {
            System.out.println("Invalid age input");
        }
    }
}
