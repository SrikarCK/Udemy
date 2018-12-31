public class Feet2Centimeters {

    public static void main(String[] args){

        double centimeters = calcFeetAndInchesToCentimeters(6,0);
        if (centimeters < 0.0){
            System.out.println("Invalid Parameter");
        }
        calcFeetAndInchesToCentimeters(157);
}

    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if ((feet < 0) || ((inches) > 12 || (inches < 0))){
            System.out.println("Invalid Input");
            return -1;
        }
        double centiMeter = (feet * 12)  * 2.54;
        centiMeter += inches * 2.54;
        System.out.println(feet + " feet, "+inches+" inches = "+centiMeter+" cm");
        return centiMeter;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0 ){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches+" inches equals to "+ feet+" feet and "+ remainingInches+" inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }
}
