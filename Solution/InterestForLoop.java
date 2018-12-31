public class InterestForLoop {
    public static void main(String[] args) {
//        for (double i = 8; i > = 2; i--) {
//            System.out.println("$10000 at "+i+"% interest = $"+ String.format("%.2f", calculateInterest(20000,i)));
//        }
        for (int i = 1; i < 20; i++) {
            System.out.println("Prime Number: "+isPrime(i));
        }
    }
    public static int isPrime(int n){
        if (n == 1){
            return n;
        }
        for (int i = 2; i <= i/n; i++) {
            if (n % i == 0){
                return n;
            }
        }
        return n;
    }
//    public static double calculateInterest(double amount, double interestRate){
//        return (amount *(interestRate/100));
//    }
}
