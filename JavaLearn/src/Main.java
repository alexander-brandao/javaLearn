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
        public Carro(int cylinders, int doors, boolean isManual, int currentVelocity) {
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

        public boolean getIsManual() {
            return isManual;
        }

        public int getCurrentVelocity(){
            return currentVelocity;
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

        public Mustang(int cylinders, int doors, boolean isManual, int currentVelocity, String color) {
            super(8, 2, true, currentVelocity);
            this.color = "Black";
        }

        @Override
        public void startEngine(boolean engine) {
            super.startEngine(engine);
        }

        @Override
        public void brake(int currentVelocity) {
            super.brake(currentVelocity);
        }

        @Override
        public void accelerate(int currentVelocity) {
            super.accelerate(currentVelocity);
        }
    }
    public class Camaro extends Carro{
        //fields
        private String color;

        //constructor
        public Camaro(int cylinders, int doors,
                      boolean isManual, int currentVelocity, String color) {
            super(8, 8, true, currentVelocity);
            this.color = "Yellow";
        }
        //methods

        @Override
        public void startEngine(boolean engine) {
            super.startEngine(engine);
        }

        @Override
        public void brake(int currentVelocity) {
            super.brake(currentVelocity);
        }

        @Override
        public void accelerate(int currentVelocity) {
            super.accelerate(currentVelocity);
        }
    }
    public class Tesla extends Carro{
        //fields
        private String color;

        //constructor

        public Tesla(int cylinders,int doors, boolean isManual, int currentVelocity, String color) {
            super(8, 2,true, currentVelocity);
            this.color = "white";
        }

        @Override
        public void startEngine(boolean engine) {
            super.startEngine(engine);
        }

        @Override
        public void brake(int currentVelocity) {
            super.brake(currentVelocity);
        }

        @Override
        public void accelerate(int currentVelocity) {
            super.accelerate(currentVelocity);
        }
    }
    public static void main(String[] args){


    }
}
