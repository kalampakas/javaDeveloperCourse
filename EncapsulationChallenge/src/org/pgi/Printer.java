package org.pgi;

import java.sql.SQLOutput;

public class Printer {
    private String model="DEC";
    private String manufacturer="Digital";
    private int pagesPrinted = 0;
    private int pagesTray = 250;
    private boolean duplex = false;
    private float toner = 25.0f;

    public Printer(String model, String manufacturer, int pagesTray, boolean duplex, float toner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.duplex = duplex;
        if (pagesTray < 0 || pagesTray > 500) this.pagesTray = 100;
        else this.pagesTray = pagesTray;
        if (toner < 0) this.toner = 0;
        else if (toner > 100) this.toner = 100.0f;
        else this.toner = toner;
    }

    public void getInfo() {
        System.out.println("Model:" + model);
        System.out.println("Manufacturer:" + manufacturer);
        System.out.println("PagesPrinted:" + pagesPrinted);
        System.out.println("Duplex:" + duplex);
        System.out.println("Toner level:" + toner);
        System.out.println("Paper in tray:" + pagesTray);
    }

    private void useToner() {
        this.toner -= 0.1f;
    }

    private void usePaper() {
        this.pagesTray -= 1;
    }

    public void printPage(int number) {
        while (pagesTray > 0 && toner > 0 && number > 0) {
            System.out.print("Printing...");
            if (duplex) {
                useToner();
                if (number % 2 == 1) usePaper();
                number--;
            } else{
            useToner();
            usePaper();
            number--;
        }
        pagesPrinted++;
        System.out.println(number + " pages left in queue.");


        if (number <= 0) System.out.println("Nothing to print.");
        if (pagesTray <= 0) {
            System.out.println("Fill paper.");
            break;
        }
        if (toner <= 0) {
            System.out.println("Fill toner.");
            break;
        }
    }

}
    public void fillToner(){
        this.toner=100.0f;
    }

    public void fillTray(int paper){
        if(paper+pagesTray>1000) this.pagesTray=1000;
        else this.pagesTray=paper+pagesTray;
    }
}