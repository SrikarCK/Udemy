public class sumDigit {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is: "+sumDigits(125));
    }

    private static int sumDigits(int number){
        if (number < 10 ){
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            //Extract The Least Significant Number
            int digit  = number % 10;
            sum += digit;
            //System.out.println(sum);
            //Drop the least significant number.
            number /= 10;
        }
        return sum;
    }
}
