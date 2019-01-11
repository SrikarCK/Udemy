package Composition;

public class PC {
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        thecase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawnPixelAt(1500,1200,"Blue");
    }
}
