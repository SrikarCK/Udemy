public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }for (int i = number; i >= 2; i--){
            if (number % i == 0){
                for (int j = i - 1; j >= 2; j--){
                    if (i % j ==0){
                        i = j;
                    }
                }
                return i;
            }
        }return  -1;
    }
}
