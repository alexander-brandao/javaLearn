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

    // method that print values
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    //method  that sort values
    public static int[] sortIntegers(int[] array){
        //create a array with the same capacity
        // as the array that is been passed to this method
        int[] sortedArray = new int[array.length];

        // create a copy of the array that is been passed
        for(int i=0; i<array.length;i++){
            sortedArray[i] = array[i];
        }

        // sort the numbers in descending order
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args){
        int[] myIntegers = getIntegers(6);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}
