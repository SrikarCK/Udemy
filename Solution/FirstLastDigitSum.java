public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }else{
            int firstdigit = 0;
            int lastDigit = number % 10;
            while(number != 0){
                firstdigit = number % 10;
                number  = number / 10;
            }
            return (firstdigit + lastDigit);
        }
    }

//    public static int sumFirstAndLastDigit(int number) {
//        if (number < 0) {
//            return -1;
//        }
//
//        char firstDigit = Integer.toString(number).charAt(0);
//        int lastDigit = number % 10;
//
//        return Integer.parseInt(String.valueOf(firstDigit)) + lastDigit;
//    }
}
