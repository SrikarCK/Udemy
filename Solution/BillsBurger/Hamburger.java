package BillsBurger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addtition1Price;

    private String addition2Name;
    private double addtition2Price;

    private String addition3Name;
    private double addtition3Price;

    private String addition4Name;
    private double addtition4Price;

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name = name;
        this.addtition1Price = price;
    }

    public void addHamburgerAddition2(String name,double price){
        this.addition4Name = name;
        this.addtition4Price = price;
    }

    public void addHamburgerAddition3(String name,double price){
        this.addition3Name = name;
        this.addtition3Price = price;
    }

    public void addHamburgerAddition4(String name,double price){
        this.addition4Name = name;
        this.addtition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrize = this.price;
        System.out.println(this.name+" hamburger "+"on a "+this.breadRollType+" roll "+"price is "+this.price);
        if (this.addition1Name != null){
            hamburgerPrize += this.addtition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addtition1Price);
        }
        if (this.addition2Name != null){
            hamburgerPrize += this.addtition2Price;
            System.out.println("Added "+this.addition2Name+" for an extra "+this.addtition2Price);
        }
        if (this.addition3Name != null){
            hamburgerPrize += this.addtition3Price;
            System.out.println("Added "+this.addition3Name+" for an extra "+this.addtition3Price);
        }
        if (this.addition4Name != null){
            hamburgerPrize += this.addtition4Price;
            System.out.println("Added "+this.addition4Name+" for an extra "+this.addtition4Price);
        }
        return hamburgerPrize;
    }
    public Hamburger(String name, String meat,double price,String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
}
