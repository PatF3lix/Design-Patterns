public class Client {

    public static void main(String[] args) {
        Context shoppingCart =  new Context();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678", 20);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        //PaypalStrategy payment
        shoppingCart.pay(new PaypalStrategy("headhunterfx@gmail.com","yabadabado"));

        //CreditCard Strategy payment
        shoppingCart.pay(new CreditCardStrategy("Headhuner","MasterCard","444", "23/12/23"));
        
    }
}