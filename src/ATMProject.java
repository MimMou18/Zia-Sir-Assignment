import java.util.Scanner;

public class ATMProject{
    private double balance = 200.0;

    public void recharge(double amount) {
        balance += amount;
    }

    public void use(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance on Gift Card!");
        }
    }

    public void checkBalance() {
        System.out.println("Gift Card Balance: " + balance);
    }

    public static void main(String[] args) {
        ATMProject card = new ATMProject();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Recharge 2.Use 3.Check Balance 4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to recharge:");
                    card.recharge(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount to use:");
                    card.use(sc.nextDouble());
                    break;
                case 3:
                    card.checkBalance();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
