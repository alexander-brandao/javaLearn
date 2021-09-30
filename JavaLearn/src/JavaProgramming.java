
public class JavaProgramming {

    /* public static void main(String[] args){

        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName() + "\n" +
                    "plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 1) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();
        }
        return null;
    } */



     /*
     Printer printer = new Printer(50,true);
        System.out.println("inicial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total print count for printer = " +
                printer.getPagesPrinted()


     criando um objeto Enhanced Player
        EnhancedPlayer player = new EnhancedPlayer("Alex",50,"Sword");
        System.out.println("Inicial health is " + player.getHealth());
        // year */




    /*
    Player player = new Player();
    player.name = "Tim";
    player.weapon = "Sword";
    player.health = 20;

    int damage = 10;
    player.loseHealth(damage);
    System.out.println("Remaining health = " + player.helthRemaining());

    damage = 11;
    player.loseHealth(damage);
    System.out.println("Remaining health = " + player.helthRemaining());

        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("north");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("east");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("morden",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,7);

        // create the Bedroom

        Bedroom bedroom = new Bedroom("Alex", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();

     */

    /*

    Dimensions dimensions = new Dimensions(20,20,5);

    Case theCase = new Case("220B", "Dell",
            "240",dimensions);

    Monitor theMoniter = new Monitor("27inch", "Acer",
            27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
            4,4,"v2.44");

    PC thePC = new PC(theCase,theMoniter,theMotherboard);
    thePC.powerUp();



    Outlander outlander = new Outlander(36);
    outlander.steer(45);
    outlander.accelerate(30);
    outlander.accelerate(20);
    outlander.accelerate(-42);
    */


   // Animal animal = new Animal("Animal",1,1,5,5);

   // Dog dog = new Dog("Yorkie",8,20,2,
          //  4,1,20,"long silky");

       // dog.walk();

    // Bank Account

    //BankAccount alexanderAccount = new BankAccount();
    // 0, "Alexander","alex@gmail.com", "12345","123456789"

    //System.out.println(alexanderAccount.getEmail());
    //System.out.println(alexanderAccount.getBalance());

         /* VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Alex","alex@gmail.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Aurora","aurora@email.com",
                1000.0);
        System.out.println(person3.getName());
         */
}
