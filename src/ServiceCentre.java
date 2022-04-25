public class ServiceCentre {
    public static void checks(Checker[] checkers){
        for (int i = 0; i < checkers.length ; i++) {
            checkers[i].serviceCheck();
            System.out.println(" ");
        }
    }
}
