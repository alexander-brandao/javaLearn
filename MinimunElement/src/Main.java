import java.util.Scanner;

public class Main {

    //method that reads user-entered values
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    //method that read integers
    private static int[] readIntegers(int count){

        //count of numbers in the array
        int[] array = new int[count];

        // loop that read the numbers entered by the user
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    //method that find the min value in the array
    private static int findMin(int[] array){

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }


}
