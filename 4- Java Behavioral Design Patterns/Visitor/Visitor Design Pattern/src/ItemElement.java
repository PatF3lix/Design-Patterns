public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruits implements ItemElement {
    private int priceKg;
    private int weight;
    private String name;

    public Fruits(int priceKg, int weight, String name) {
        this.priceKg = priceKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPriceKg() {
        return priceKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
