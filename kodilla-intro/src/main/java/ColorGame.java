public class ColorGame {
    public static void main(String[] args) {
        String userInput = ColorSelection.getUserInput();
        switch (userInput.toUpperCase()) {
            case "W" :
                System.out.println("white");
            case "P" :
                System.out.println("pink");
            case "Y" :
                System.out.println("Yellow");
            case "G" :
                System.out.println("green");
            case "B" :
                System.out.println("Black");
            case "V" :
                System.out.println("Violet");
        }
    }
}
