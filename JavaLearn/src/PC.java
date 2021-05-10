public class PC {

    // Fields //
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // Constructor //
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // Methods //

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphcs
        monitor.drawPixelAt(1200,50," yellow");
    }

}
