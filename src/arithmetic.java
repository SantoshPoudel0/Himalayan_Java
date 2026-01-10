import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {

     //   Please excuse my dope ass swag  [ P E M D A S ] - order of operations
        char currency = '$';
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy ?: ");
        String item = scanner.nextLine();

        System.out.print("what is the price of each ?: ");
        double price = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("How many would you like to buy?: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.print("Your Total is: " + total + currency);

        // total price and  how many i buy that show
    }
}
