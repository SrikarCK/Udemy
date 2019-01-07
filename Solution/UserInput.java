import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter Number #"+order+":");
            boolean isAnInt = input.hasNextInt();
            if (isAnInt){
                int number = input.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
                }else {
                    System.out.println("Invalid Number");
                }
                input.nextLine();
            }
        System.out.println("Sum = "+sum);
        input.close();
    }
}
