package OOP2.Composition.thePc;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public void powerUp(){
    theCase.pressPowerButton();
    drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50, "yellow");
    }


    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
}
