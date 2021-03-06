package execution_model;

public class Item {

    //reprezentuje pozycję na fakturze. Każdy obiekt nowego typu będzie zawierać nazwę i cenę.
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
