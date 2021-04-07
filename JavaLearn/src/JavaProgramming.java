import java.lang.String;
public class JavaProgramming {

    public static void main(String[] args){
    Dimensions dimensions = new Dimensions(20,20,5);

    Case theCase = new Case("220B", "Dell",
            "240",dimensions);

    Monitor theMoniter = new Monitor("27inch", "Acer",
            27, new Resolution(2540, 1440));

    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
            4,4,"v2.44");

    PC thePC = new PC(theCase,theMoniter,theMotherboard);

    thePC.getMonitor().drawPixelAt(1500,1200,"red");
    thePC.getMotherboard().loadProgram("Windows 1.0");
    }


    /*
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
