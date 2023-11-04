import java.util.Scanner;

public class Client {
    private final DispenseChain c1;

    public Client() {
        //Initialize chain Important step
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        this.c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        Client atmDispenser = new Client();
        boolean quit = false;
        while(!quit){

            int amount;
            System.out.println("Enter amount to dispense: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 10 != 0) {
                System.out.println("Amount should be in multiples of 10s");
            }else{
                //process the request
                atmDispenser.c1.dispense(new Currency(amount));
//                quit = true;
            }
        }
    }
}