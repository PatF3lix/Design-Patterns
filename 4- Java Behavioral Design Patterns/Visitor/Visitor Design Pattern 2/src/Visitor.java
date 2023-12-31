public interface Visitor {
    void visit(Book book);
    void visit(CD cd);
    void visit(DvD dvd);
    double getTotalPostage();
}

class USPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    //collect data about ShoppingCart Items
    @Override
    public void visit(Book book) {
        /*Assume we have a calculation here related to weight and price,
        * free postage for a book over 20 $*/
        if(book.getPrice() < 20 ) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 20 ) {
            totalPostageForCart += cd.getWeight() * 2.5;
        }
    }

    @Override
    public void visit(DvD dvd) {
        if(dvd.getPrice() < 20 ) {
            totalPostageForCart += dvd.getWeight() * 3;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}

class  SouthAmericaPostageVisitor implements Visitor {
    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(book.getPrice() < 30){
            totalPostageForCart += (book.getWeight() * 2) * 2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice() < 30){
            totalPostageForCart += (cd.getWeight() * 2.5) * 2;
        }
    }

    @Override
    public void visit(DvD dvd) {
        if(dvd.getPrice() < 30){
            totalPostageForCart += (dvd.getWeight() * 3) * 2;
        }
    }

    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }
}







