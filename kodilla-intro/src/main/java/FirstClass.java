public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1500, 1992);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkWeight();
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook (2000, 1505, 1993);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook (12000, 20000, 2010);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();



    }
}