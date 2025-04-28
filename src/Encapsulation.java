class Wallet {
    private double cash;

    public void addCash(double amount) {
        if (amount > 0) cash += amount;
    }

    public double getCash() {
        return cash;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        myWallet.addCash(300);
        System.out.println(myWallet.getCash());
    }
}
