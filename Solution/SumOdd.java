public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(100,100));
    }
    //Method to identify number is odd.
    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }else if (number % 2 != 0){
            return true;
        }else {
            return false;
        }
    }
    //Method to sum odd number.
    public static int sumOdd(int start, int end){
        if((end < start) || (start < 0) || (end < 0)){
            return -1;
        }
        int result = 0;
        for(int i = start; i <= end;i++){
            if(isOdd(i)){
                result += i;
            }
        }
        return result;
    }
}
