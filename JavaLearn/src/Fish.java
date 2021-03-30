public class Fish extends Animal {

    //fields

    private int gills;
    private int eyes;
    private int fins;


    // constructor
    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        // Inheritance
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // methods

    private void rest(){

    }

    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}