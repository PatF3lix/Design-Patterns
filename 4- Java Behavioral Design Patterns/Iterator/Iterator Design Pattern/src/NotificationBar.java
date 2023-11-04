
//Contains collection of notifications as an object of notificationCollection
 class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    public void printNotifications() {
        Iterator iterator = notifications.createIterator();
        System.out.println("--------Notification Bar-----------");
        while(iterator.hasNext()){
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
