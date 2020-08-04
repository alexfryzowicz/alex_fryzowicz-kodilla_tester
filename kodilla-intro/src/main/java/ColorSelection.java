import java.util.Scanner;

public class ColorSelection {
    public static String getUserInput() {
        System.out.println("enter the first letter of the color:");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine(); //zwraca string
        return color;
    }
}
