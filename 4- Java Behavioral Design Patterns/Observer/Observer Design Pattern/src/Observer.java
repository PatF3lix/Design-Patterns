public interface Observer {

    //Method to update the observer, used by subject
    void update();

    //Attach with subject to observe, not required, but, added so that th
    //Observer can query the subject to see if an update has occured
    void setSubject(Subject sub);
}


class MyTopicSubscriber implements Observer {
    private String name;

    //not required, could just pass subjects state to update method, but, also used to attach
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        //This method could take data of subjects state that was changed, would not need to ask topic for it
        String msg = (String) topic.getUpdate(this);
        if(msg == null) {
            System.out.println(name + ":: No new Message");
        }else {
            System.out.println(name+":: Consuming message::"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        //not required, added so oberver can ask subject for state
        this.topic=sub;
    }
}