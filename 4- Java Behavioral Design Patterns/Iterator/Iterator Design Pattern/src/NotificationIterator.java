

class NotificationIterator implements Iterator{

    Notification[] notificationList;

    //maintains curr pos iterator over the array
    int pos;

    public NotificationIterator(Notification[] notificationList)
    {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext()
    {
        return pos < notificationList.length && notificationList[pos] != null;
    }

    @Override
    public Object next()
    {
        //return next element in the array and increment pos
        Notification notificaion = notificationList[pos];
        pos++;
        return notificaion;
    }
}
