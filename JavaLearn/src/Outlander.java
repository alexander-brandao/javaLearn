public class Outlander extends Car {

    //** fields **//

    private int roadServiceMonths;

    //** Constructor **//


    public Outlander( int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
