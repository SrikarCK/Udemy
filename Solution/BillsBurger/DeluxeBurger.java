package BillsBurger;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon",14.54,"White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drinks",1.81);
    }
}
