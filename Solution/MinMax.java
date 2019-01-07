import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while (true){
            System.out.println("Enter Number:");
            boolean isInt = input.hasNextInt();
            if (isInt){
                int number = input.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else {
                System.out.println("invalid Number");
                break;
            }
        }
        System.out.println("Minimum Number: "+min);
        System.out.println("Maximum Number: "+max);
    }
}
