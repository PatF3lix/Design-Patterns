public interface Collection {
    public Iterator createIterator();
}

class NotificationCollection implements Collection {
    static final int MAX_ITEMS =6;
    int numberOfItems = 0;
    Notification [] notifications;

    public NotificationCollection() {
        notifications  = new Notification[MAX_ITEMS];

        addItems("Notification 1");
        addItems("Notification 2");
        addItems("Notification 3");
    }

    public void addItems(String str) {
        Notification notification = new Notification(str);

        if(numberOfItems >= MAX_ITEMS){
            System.err.println("Full");
        }else{
            notifications[numberOfItems] = notification;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notifications);
    }
}
