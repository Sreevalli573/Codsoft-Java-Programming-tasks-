import java.util.Scanner;

public class ATMMachine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bankaccount account = new Bankaccount(7000, 1234);

        System.out.print("Enter your PIN: ");
        if (!account.verifyPin(scanner.nextInt())) {
            System.out.println("Incorrect PIN. Access denied!!!.");
            scanner.close();
            return ;
        }

             boolean exit=false;
             while(!exit) {
            System.out.println("\nATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose any option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance amount: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("Deposit amount: ");
                    int dep = scanner.nextInt();
                    if (dep > 0) {
                       account.deposit(dep);
                        System.out.println("Deposited amount" + dep);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Withdraw amount: ");
                    int wd = scanner.nextInt();
                    if (account.withdraw(wd)) {
                        System.out.println("Withdrew amount" + wd);
                    } else {
                        System.out.println(wd > account.getBalance() ? "Insufficient funds.." : "Invalid amount..");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!!");
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid choice.Please choose 1 to 4.");
            }
             }
        scanner.close();
    }
}
