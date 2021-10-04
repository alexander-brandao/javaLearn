import java.util.Scanner;

public class Main {

    // native object what scan a data of console
    private static Scanner scanner = new Scanner(System.in);

    //method that get integers
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void main(String[] args){
        int[] myIntegers = getIntegers(6);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
    }
}
