public class Car extends Vehicle {

    //** fields **//

    private int doors;
    private int wheels;
    private int gears;
    private boolean isManual;

    private int currentGear;

    //** Constructor **//

    public Car(String name, String size, int doors, int wheels,
               int gears, boolean isManual) {
        super(name, size);
        this.doors = doors;
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    //** methods **//

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGear + " gear.");
    }
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }





}
