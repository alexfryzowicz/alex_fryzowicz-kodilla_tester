public class LeapYear {
    public static void main(String[] args) {
        int year = 2021;
        int four = 4;
        int oneHundred = 100;
        int fourHundred = 400;

        System.out.println(year);

        if (year % four ==0 ) {
            System.out.println("przestępny");
        } else  if (year % oneHundred ==0 ){
            System.out.println("przestępny");
        } else if (year % fourHundred ==0) {
            System.out.println("przestępny");
        } else {
            System.out.println("nieprzestępny");
        }
    }

    private static void sumAndDisplay(int a, int b) {
        int result = a % b;

        System.out.println(result);
    }

    private static void subtractAndDisplay( int a, int b) {
        int result = a % b;
        System.out.println(result);
    }
}