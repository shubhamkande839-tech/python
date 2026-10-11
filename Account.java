public class Account {
    String Acc_holder_name;
    double balance;

    void transfer(Account receiver, double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Transferred " + amount + " successfully.");
        } else {
            System.out.println("Transfer failed: Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();

        a1.balance = 20000;
        a2.balance = 15000;

        a1.transfer(a2, 5000);
        a2.transfer(a1, 6000);

        System.out.println("\nFinal Balances:");
        System.out.println("a1 balance: " + a1.balance);
        System.out.println("a2 balance: " + a2.balance);
    }
}
