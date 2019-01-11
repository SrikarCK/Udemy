package constructors;

public class Main {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmailAddress());
    }
}
