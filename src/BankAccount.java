public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        System.out.println("The account number is: " + accountNumber);
        return accountNumber;
    }

    public double getBalance() {
        System.out.println("Current Balance is "+ balance);
        return balance;
    }

    public String getName() {
        System.out.println("The name is: " + name);
        return name;
    }

    public String getEmail() {
        System.out.println("Email: " + email);
        return email;
    }

    public String getPhoneNumber() {
        System.out.println("The phone number is: " + phoneNumber);
        return phoneNumber;
    }
    public double deposit(double depositFound){
        System.out.println("New deposit and current Balance " + balance + " + " + depositFound + " = " + (balance + depositFound) );
       balance += depositFound;
        setBalance(balance);
        return balance;
    }

    public double withdraw(double withdrawFound){
        if (balance >= withdrawFound){
            System.out.println("New Withdraw and current Balance " + balance + " - " + withdrawFound + " = " + (balance - withdrawFound) );
            balance -= withdrawFound;
            setBalance(balance);
            return balance;
        }else {
            System.out.println("Your current Balance " + balance + " is lower then withdraw amount " + withdrawFound + " The operation is canceled ");
            return -1;
        }

    }
}
