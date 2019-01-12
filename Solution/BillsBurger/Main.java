package BillsBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic","Sasuage",3.56,"White");
        double price;
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.13);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price of hamburger is: "+price);

        System.out.println("**************************");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg",5.43);
        healthyBurger.addHealthAddition1("Pork",3.41);
        System.out.println("Total Healthy Burger Price is "+healthyBurger.itemizeHamburger());

        System.out.println("**************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
    }
}
