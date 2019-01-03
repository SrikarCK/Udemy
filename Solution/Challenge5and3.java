public class Challenge5and3 {
    public static void main(String[] args) {
        int count = 0;
        int result = 0;
        for (int i = 1; i <= 1000 ; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                result += i;
                System.out.println(i);
            }
                if (count == 5){
                    break;
                }
            }
        System.out.println("***********");
        System.out.println(result);
        }
    }
