import java.util.Scanner;

public class JavaProgramming {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); // cria um objeto para receber dados de entrada do cosole


        // variaveis auxiliares para um valor minino e outra para um valor maximo
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       // boolean first = true;

        while (true) {

            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();

             /*   if(first){
                    first = false;
                    min = number;
                    max = number;
                } */

                if(number > max){
                    max = number;
                }

                if(number < min){
                    min = number;
                }

            }else{
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min= " + min + " max= " + max);
        scanner.close(); // fecha a entrada de dados no console
    }
}
