public class Client {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***\n");

        //Initially Tv is OFF
        Off initialState = new Off();

        Context tv = new Context(initialState);

        //First Time press
        tv.pressedPowerButtonRemote();
        //Second Time Press
        tv.pressedPowerButtonRemote();
        
    }
}