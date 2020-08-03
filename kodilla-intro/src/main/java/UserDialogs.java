import java.util.Scanner;

    public class UserDialogs {
        public static String getUsername() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("enter your name:");
                String name = scanner.nextLine().trim().toUpperCase();
                if (name.length() >= 2) {
                    return name;
                }
                        System.out.println("name is too short");
                }
             }
            public static String getUserSelection() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("select calculation (A-add, S-subtract, D-divide, M-multiply):");
                    String calc = scanner.nextLine().trim().toUpperCase();
                    switch (calc) {
                        case "A" : return "ADD";
                        case "S" : return "SUB";
                        case "D" : return "DIV";
                        case "M" : return "MUL";
                        default:
                            System.out.println("wrong calculation. try again.");
                    }
                }
            }
                public static int getValue() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("enter number:");
                    int val = scanner.nextInt();
                    return val;
        }
    }



