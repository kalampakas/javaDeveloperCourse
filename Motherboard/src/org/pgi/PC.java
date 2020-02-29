package org.pgi;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard mobo;

    public PC(Case theCase, Monitor monitor, Motherboard mobo) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.mobo = mobo;
    }
public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
}

private void drawLogo(){
        monitor.drawPixelAt(100,200,"red");
        monitor.drawPixelAt(120,180,"blue");
}
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMobo() {
        return mobo;
    }
}
