public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkProfile() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

    public static void main(String[] args) {
        Application application = new Application("Adam", 40.5, 178);
        System.out.println(application.name + " " + application.age + " " + application.height);
        application.checkProfile();
        application.checkProfile();
    }
}