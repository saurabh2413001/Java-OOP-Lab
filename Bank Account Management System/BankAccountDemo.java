public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC101", "Aman", 5000.0);

        System.out.println("Account Number: " + account.getAccountNumber());

        System.out.println("Account Holder: " + account.getAccountHolderName());

        System.out.println("Initial Balance: " + account.getBalance());

        boolean depositSuccess = account.deposit(1500.0);
        System.out.println("Deposit Successful: " + depositSuccess);
        System.out.println("Balance After Deposit: " + account.getBalance());

        boolean withdrawalSuccess = account.withdraw(2000.0);
        System.out.println("Withdrawal Successful: " + withdrawalSuccess);
        System.out.println("Balance After Withdrawal: " + account.getBalance());

        boolean invalidWithdrawal = account.withdraw(10000.0);
        System.out.println("Invalid Withdrawal Successful: " + invalidWithdrawal);
        System.out.println("Final Balance: " + account.getBalance());
    }
}


