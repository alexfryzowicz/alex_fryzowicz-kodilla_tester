public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[] {"A little life",  "Little Prince", "Shoe Dog", "When Breath Becomes Air", "Wild"};

        System.out.println(books);

        String book = books[3];
        System.out.println(book);
        int numberOfElements = books.length;
        System.out.println(numberOfElements);
    }
}

