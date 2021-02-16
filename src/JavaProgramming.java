import java.lang.String;
public class JavaProgramming {

    public static void main(String[] args){

        // Bank Account

        BankAccount alexanderAccount = new BankAccount();
        // 0, "Alexander","alex@gmail.com", "12345","123456789"

        System.out.println(alexanderAccount.getEmail());
        System.out.println(alexanderAccount.getBalance());

    }
}
