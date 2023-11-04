public interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardName;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardName, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardName = cardName;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

class PaypalStrategy implements PaymentStrategy {
    private String email_id;
    private String password;

    public PaypalStrategy(String email_id, String password) {
        this.email_id = email_id;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}
