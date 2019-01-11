package Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch","Hp",27,new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("Bj-200","Intel",2,4,"v2.44");

        PC thePC = new PC(theCase,theMonitor,motherboard);
        thePC.powerUp();
    }
}
