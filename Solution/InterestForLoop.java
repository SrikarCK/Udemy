public class InterestForLoop {
    public static void main(String[] args) {
//        for (double i = 8; i > = 2; i--) {
//            System.out.println("$10000 at "+i+"% interest = $"+ String.format("%.2f", calculateInterest(20000,i)));
//        }
        int count  = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Prime Number: " + i);
                if (count == 10){
                    System.out.println("Exiting the loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true ;
    }
//    public static double calculateInterest(double amount, double interestRate){
//        return (amount *(interestRate/100));
//    }
}
