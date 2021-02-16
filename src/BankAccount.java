public class BankAccount {

    // fields //
    private int accountNumber,balance, phoneNumber;
    private String customerName, email;

    // methods //

        //setters //

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }

        // getters //

    public int getAccountNumber(int accountNumber){
        return accountNumber;
    }
    public int getBalance(int balance){
        return balance;
    }
    public int getPhoneNumber(int phoneNumber){
        return phoneNumber;
    }
    public String getCustomNumber(String customerName){
        return customerName;
    }
    public String getEmail(String email){
        return email;
    }

        // Special Methods //

    public int depositFunds(int deposit){
        if(deposit > 0 ){
            balance += deposit;
            System.out.println("\n" +
                    "Deposit completed successfully " + "your balance is " + balance);
        } else {
            System.out.println("Invalid value");
        }
        return balance;
    }

    public int withdrawFunds(int withdraw){
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
