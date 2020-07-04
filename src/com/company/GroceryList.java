package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public void printList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i =0; i<groceryList.size(); i++){
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }
    }

    public String findItem(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }

}
