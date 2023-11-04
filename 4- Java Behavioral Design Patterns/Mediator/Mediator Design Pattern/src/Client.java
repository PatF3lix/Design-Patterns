public class Client {

    public static void main(String[] args)
    {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Patrick");
        User user2 = new UserImpl(mediator, "felix");
        User user3 = new UserImpl(mediator, "Joanne");
        User user4 = new UserImpl(mediator, "John");
        User user5 = new UserImpl(mediator, "Zeek");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi Everyone!");
    }
}