import java.util.Random;

public class User {

        String name;
        int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String showName() {
        System.out.println(this.name);
        return this.name;
    }

    public int showAge() {
        System.out.println(this.age);
        return this.age;
    }

    public static void main(String[] args) {
        User Bill = new User ("Bill", 17);
        User Jack = new User ("Jack", 22);
        User Jim = new User ("Jim", 29);
        User Mary = new User ("Mary", 5);

        User[] users = new User[] {Bill, Jack, Jim, Mary};


    int sum = 0;
    for (int i = 0; i < users.length; i++) {
        sum = sum + users[i].showAge();
    }
    int average = sum / users.length;
    for (int i = 0; i < users.length; i++) {
        User user = users[i];
        int age= user.showAge();
        if (age > average) {
            System.out.println(user.showName());
        };
    }
}
}
