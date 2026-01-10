import java.util.Random;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        number = random.nextInt(1,7);
        System.out.println("The rolling dice is: " + number);

    }
}