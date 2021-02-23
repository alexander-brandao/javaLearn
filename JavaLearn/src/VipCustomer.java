public class VipCustomer {

    // Fields
    public String name, email;
    public double creditLimit;

        //constructors


    public VipCustomer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, String email) {
        this(name, email, 0.0);

    }
    public VipCustomer() {
        this("Default", "Default@email.com", 0.0);
    }

    // setters and getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
