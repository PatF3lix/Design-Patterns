package com.company;




class RealPrinter {
//    the "delegate"
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
//    the "delegator"
    RealPrinter p = new RealPrinter();

//    create the delegate
    void print() {
//        delegation
        p.print();
    }
}

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer();
        printer.print();
    }
}
