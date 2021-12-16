package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	        boolean quit = false;
            int choice = 0;
            printInstructions();
            while(!quit){
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){

                    case 0:
                        printInstructions();
                        break;

                    case 1:
                        groceryList.printGroceryList();
                        break;

                    case 2:
                        groceryList.addGroceryList();
                        break;

                    case 3:
                        groceryList.modifyGroceryItem();
                        break;

                    case 4:
                        groceryList.removeGroceryItem();
                        break;

                    case 5:
                        groceryList.findItem();
                        break;

                    case 6:
                        quit = true;
                        break;
                }
            }

    }
}
