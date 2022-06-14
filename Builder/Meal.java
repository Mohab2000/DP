package Builder;
import java.util.ArrayList;
import java.util.List;
public class Meal {
    private List<Item> Items = new ArrayList<>();
    public void addItem(Item item) {
        Items.add(item);
    }
    public float getCost() {
        float cost=0.0f;
        for(Item item : Items) {
            cost+= item.price();
        }
        return cost;
    }
    public void showItems() {
        for(Item item : Items) {
            System.out.println("Item " + item.name());
            System.out.println("Packing " + item.packing().pack());
            System.out.println("Price " + item.price());
        }
    }
}
