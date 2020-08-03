import java.util.Random;

public class UserRunner {
    public static void main(String[] args) {

        Random random = new Random();

        int result = 0;
        int sum = 0;
        int minimum = 0;
        int maximum = 30;

        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            System.out.println(temp);
            result++;
            for (temp = 0; temp < minimum; temp++) ;
            minimum = temp;
            System.out.println("the lowest number is " + temp);
            for (temp = 30; temp > maximum; temp++) ;
            maximum = temp;
            System.out.println("the highest number is " + temp);
        }
    }
}