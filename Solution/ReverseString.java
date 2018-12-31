import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input != null) {
            String name = input.nextLine();
            String fin = "";
            for (int i = name.length() - 1; i >= 0; i--) {
                fin = fin + name.charAt(i);
            }
            System.out.println(fin);
        }
    }
}
