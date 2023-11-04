import java.util.ArrayList;
import java.util.List;

//ShoppingCart
public class Context {
    List<Item> items;

    public Context() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for(Item item : items)
            sum += item.getPrice();
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }

}
