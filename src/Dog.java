public class Dog extends Animal {


    // fields for dogs
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    // Constructors and Inheritance
    public Dog(String name,int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = legs;
        this.teeth= teeth;
        this.coat = coat;

    }

    // Methods

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
