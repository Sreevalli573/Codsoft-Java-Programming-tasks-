import java.util.Scanner;

public class SimpleCurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Currency Converter");
        System.out.println(" currencies: USD, EUR, INR");

        System.out.print("Enter base currency: ");
        String base = scanner.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = scanner.next().toUpperCase();

        System.out.print("Enter amount in " + base + ": ");
        double amount = scanner.nextDouble();
        double rate = getExchangeRate(base, target);

        if (rate == 0) {
            System.out.println("Conversion between " + base + " and " + target + " is not supported.");
        } else {
            double result = amount * rate;
            System.out.printf("%.2f %s = %.2f %s\n", amount, base, result, target);
        }

        scanner.close();
    }

    public static double getExchangeRate(String base, String target) {

        if (base.equals("USD") && target.equals("EUR")) return 0.91;
        if (base.equals("EUR") && target.equals("USD")) return 1.10;
        if (base.equals("USD") && target.equals("INR")) return 83.0;
        if (base.equals("INR") && target.equals("USD")) return 0.012;
        if (base.equals("EUR") && target.equals("INR")) return 91.0;
        if (base.equals("INR") && target.equals("EUR")) return 0.011;

        if (base.equals(target)) return 1.0;

        return 0; 
    }
}
