public class Main {

    public static String moneyMade() {
        int amount = 5000;
        String memo = "Total money made: $" + amount;
        return memo;
    }

    public static void main(String[] args) {
        String report = moneyMade();
        System.out.println(report);
    }
}
