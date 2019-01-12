
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        int count = scan.nextInt();
        int[] array = getIntegers(count);
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static int[] getIntegers(int number1){
        int[] array1 = new int[number1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan.nextInt();
        }
        return array1;
    }

    public static void  reverseArray(int[] array1){
        int maxIndex = array1.length-1;
        int halfLength = array1.length/2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array1[i];
            array1[i] = array1[maxIndex - i];
            array1[maxIndex- i ] = temp;
        }
    }



}
