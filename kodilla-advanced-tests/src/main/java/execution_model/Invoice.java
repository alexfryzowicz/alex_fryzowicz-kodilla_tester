package execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    //przechowuje listę pozycji
    //cztery funkcjonalności:
    //
    //dodanie nowej pozycji do faktury,
    //pobranie pozycji z faktury, jeśli przekazany indeks jest prawidłowy,
    //usunięcie wszystkich pozycji z faktury,
    //zwrócenie liczby pozycji na fakturze.

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Item getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return this.items.get(index);
        }
        return null;
    }

    public void clear() {
        this.items.clear();
    }

    public int getSize() {
        return this.items.size();
    }
}
