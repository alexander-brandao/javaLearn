public class Main {
    public class Carro {
        // fields
        private boolean engine;
        private int cylinders;
        private int wheels;
        private int doors;
        private boolean isManual;
        private int currentVelocity;

        //constructor
        public Carro(boolean engine, int cylinders, int wheels, int doors, boolean isManual, int currentVelocity) {
            this.engine = true;
            this.cylinders = cylinders;
            this.wheels = 4;
            this.doors = doors;
            this.isManual = isManual;
            this.currentVelocity = currentVelocity;
        }

        // getters
        public int getCylinders() {
            return cylinders;
        }

        public int getDoors() {
            return doors;
        }

        public boolean isManual() {
            return isManual;
        }

        // methods

        public void startEngine(boolean engine){
            this.engine = engine;
            if(engine == true){
                System.out.println("the engine is running");
            } else{
                System.out.println("the engine is not running");
            }
        }

        public void brake(int currentVelocity){
            if (currentVelocity == 0){
                System.out.println("the car is stopped");
            }
        }

        public void accelerate(int currentVelocity){
            if (currentVelocity == 0){
                brake(0);
            } else{
                System.out.println("the car us accelerate");
            }
        }
    }
    public class Mustang extends Carro {

        //fields
        private String color;

        public Mustang(boolean engine, int cylinders, int wheels, int doors, boolean isManual,
                       int currentVelocity, String color) {
            super(true, 8, wheels, 2, false, currentVelocity);
            this.color = "black";
        }


    }
    public static void main(String[] args){


    }
}
