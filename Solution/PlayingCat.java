public class PlayingCat {
    public  static void main(String[] args){
        System.out.println(isCatPlaying(false, 26));
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return (isSummer ? (temp <= 45 && temp >= 25) : (temp <= 35 && temp >=25));
    }
}
