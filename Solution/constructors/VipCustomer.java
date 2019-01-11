package constructors;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Unknown",100,"Unknown@gmail.com");
    }

    public VipCustomer(int creditLimit, String emailAddress){
        this("Unknown",creditLimit,emailAddress);
    }

    public VipCustomer(String name, int CreditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = CreditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
