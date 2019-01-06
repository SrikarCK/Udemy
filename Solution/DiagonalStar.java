public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(6);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else {
            // First row
            for (int column = 1; column <= number; column++) {
                System.out.print("*");
            }
            System.out.println();
            // Second row to (number-1) rows
            for (int currentRow = 2; currentRow <= number - 1; currentRow++) {
                for (int column = 1; column <= number; column++) {
                    if (column == 1 || column == currentRow || column == number || column == (number - (currentRow - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            // Final row
            for (int column = 1; column <= number; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
