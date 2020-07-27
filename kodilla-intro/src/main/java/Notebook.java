public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("this notebook is very cheap");
        }
        else if (this.price > 600 && this.price < 1000){
            System.out.println("the price is good");
        }
        else {
            System.out.println("this notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("this notebook is light");
        }
        else if (this.weight > 600 && this.weight < 2000){
            System.out.println("this notebook is heavy");
        }
        else {
            System.out.println("this notebook is very heavy");
        }
    }
    public void checkBest() {
        if (this.weight < 600 && this.year < 1992) {
            System.out.println("this notebook of the ligest of the 1992'");
        }
        else if (this.weight > 600 && this.year < 1992){
            System.out.println("this notebook of the ligest of the 1992'");
        }
        else if (this.weight > 12000 && this.year == 2010){
            System.out.println("this notebook is the latest and the heaviest in 2010'");
        }
    }
}