package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    groceryList.printList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3 :
                    removeItem();
                    break;
                case 4 :
                    searchItem();
                    break;
                case 5 :
                    System.out.println("You have exit the app." + "\n" + "Have a nice day!");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t Welcome to grocery list app!" +"\n"+" \t Enter your choice:");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To remove an item from the list.");
        System.out.println("\t 4 - To search for an item in the list.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addItem() {
            System.out.println("Enter the grocery item: ");
            groceryList.addItem(scanner.nextLine());
    }

    public static void removeItem(){
        System.out.println("Enter item number to remove: ");
        int itemNum = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNum - 1);
    }

    public static void searchItem(){
        System.out.println("Item to search for: ");
        String search = scanner.nextLine();
        if(groceryList.findItem(search) != null){
            System.out.println("Found " + search + " in your grocery list!");
        }else{
            System.out.println(search + " is not in the grocery list!");
        }
    }
}
