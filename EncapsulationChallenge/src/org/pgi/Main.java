package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer myPrinter=new Printer("DEC-300P","Digital",300,true,600);
        myPrinter.printPage(700);
        myPrinter.getInfo();
        myPrinter.fillTray(500);
        myPrinter.printPage(100);
        myPrinter.fillToner();
        myPrinter.getInfo();
    }
}
