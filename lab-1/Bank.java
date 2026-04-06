public class Bank {
    double amount;

    public Bank(double amount) {
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
    }

    public static void main(String[] args) {
        Bank account = new Bank(10000.0);
        account.withdraw(5000.0);
        account.deposit(5000.0);
        System.out.println("after deposit,available balance:" + account.amount);
    }
}