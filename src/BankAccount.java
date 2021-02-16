public class BankAccount {

    // fields //
    private double balance;
    private String customerName, email, accountNumber, phoneNumber;

    // Constructors //

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(double balance, String customerName, String email, String accountNumber, String phoneNumber){

    }

    // methods //

        //setters //

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }

        // getters //

    public String getAccountNumber(String accountNumber){
        return accountNumber;
    }
    public double getBalance(double balance){
        return balance;
    }
    public String getPhoneNumber(String phoneNumber){
        return phoneNumber;
    }
    public String getCustomNumber(String customerName){
        return customerName;
    }
    public String getEmail(String email){
        return email;
    }

        // Special Methods //

    public double depositFunds(double deposit){
        if(deposit > 0 ){
            balance += deposit;
            System.out.println("\n" +
                    "Deposit completed successfully " + "your balance is " + balance);
        } else {
            System.out.println("Invalid value");
        }
        return balance;
    }

    public double withdrawFunds(double withdraw){
        if(withdraw < balance || withdraw == balance){
            balance -= withdraw;
            System.out.println("\n" +
                            "withdraw completed successfully " + "you balance is " + balance);
        } else {
            System.out.println("Balance unavailable");
        }
        return balance;
    }

}
