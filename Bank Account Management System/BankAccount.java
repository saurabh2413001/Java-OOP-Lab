public class BankAccount {

    // Declare private fields for accountNumber,
    // accountHolderName, and balance.
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Create a constructor with parameters:
    // String accountNumber, String accountHolderName, double initialBalance.
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance){
          if (accountNumber == null || accountNumber.trim().isEmpty()) {
        throw new IllegalArgumentException("Invalid account number");
    }

    if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
        throw new IllegalArgumentException("Invalid account holder name");
    }

    if (initialBalance < 0 || !Double.isFinite(initialBalance)) {
        throw new IllegalArgumentException("Invalid balance");
    }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Create getter methods for all three fields.
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public double getBalance(){
        return balance;
    }

    // Implement setAccountHolderName(String accountHolderName).
    public void setAccountHolderName(String accountHolderName){
        if(accountHolderName == null || accountHolderName.trim().isEmpty()){
    throw new IllegalArgumentException();
}
    this.accountHolderName = accountHolderName;
    }

    // Implement deposit(double amount).
    // Return true if successful; otherwise, return false.
    public boolean deposit(double amount){
        if(amount>0 && balance <= Double.MAX_VALUE-amount){
            balance+=amount;
            return true;
        }
        return false;
    }

    // Implement withdraw(double amount).
    // Return true if successful; otherwise, return false.
    public boolean withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            return true;
        }
        return false;
    }

}


