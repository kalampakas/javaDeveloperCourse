package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Case theCase=new Case("XZ-01","BlackSomething","550W", new Dimensions(30,20,50));
        Monitor theMonitor=new Monitor("23FE","Samsung",24,new Resolution(1920,1080));
        Motherboard theMobo=new Motherboard("A350M-Gaming-3","Gigabyte",4,3,"AMI");

        PC thePC = new PC(theCase,theMonitor,theMobo);
        thePC.powerUp();
        thePC.getMonitor().drawPixelAt(128,256,"blue");
        thePC.getMobo().loadProgram("Plan9");
        thePC.getTheCase().pressPowerButton();
    }
}
