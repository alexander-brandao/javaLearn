import java.lang.String;
public class JavaProgramming {

    public static void main(String[] args){

        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,
                4,1,20,"long silky");

        dog.eat();

    }

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
