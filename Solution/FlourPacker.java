public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
         bigCount *= 5;
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if ((bigCount + smallCount >= goal) && (goal %5 <= smallCount)){
            return true;
        }
        return false;
    }
}
