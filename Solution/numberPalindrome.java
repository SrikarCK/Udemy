public class numberPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1001));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        if(number < 0){
            number = -(2 * number);
        }
        int number1 = number;
        while (number > 0){
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (reverse == number1){
            return true;
        }else {
            return false;
        }
    }
}
