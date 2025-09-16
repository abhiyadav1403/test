// package Day5;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private boolean isActive;
    private int pin;

    public BankAccount(String accountNumber, String accountHolderName, String accountType, double initialBalance, int pin){

        if (accountNumber == null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("Account number cannot be null or empty");
        }
        if (accountHolderName == null || accountHolderName.isEmpty()){
            throw new IllegalArgumentException("Account holder name cannot be null or empty");

        }
        if (initialBalance < 0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        if (pin < 1000 || pin > 9999){
            throw new IllegalArgumentException("PIN must be a 4-digit number");
        }
        
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialBalance;
        this.pin = pin;
        this.isActive = true; 

    }
     public String getAccountNumber() {
        return accountNumber;

}

public class Encapsulation {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("987654321", "john", "Saving", 4999.0, 1234);
        BankAccount account2 = new BankAccount("123456789", "Alice", "Current", 15000.0, 5678);

       
         account1.getAccountNumber();

        }
       

    }
}



