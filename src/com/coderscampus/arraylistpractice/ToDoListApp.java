package com.coderscampus.arraylistpractice;
import java.util.*;

public class ToDoListApp {
    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();

        System.out.println("Today's To Do List");

        // Task 1: Instantiate an ArrayList and add three chores
        app.addChore("Wash Dishes");
        app.addChore("Fold Laundry");
        app.addChore("Code For an Hour");

        // Task 2: Print updated list to console
        System.out.println("After Chore 2: ");
        app.displayChores();
        System.out.println();

        // Task 3: Remove
        app.removeChores("Wash Dishes");
        System.out.println("After Chore 3:");
        app.displayChores();
        System.out.println();

        // Task 4: Update
        app.updateChores("Code For an Hour","Code All Day");
        System.out.println("After Chore 4:");
        app.displayChores();

    }

    private List<String> chores;

    public ToDoListApp() {
        chores = new ArrayList<>(); //using the List interface, coding to the interface?
    }

    // Method to add an item to the list
    public void addChore(String chore) {
        chores.add(chore);
    }

    // Method to display the items in the list
    public void displayChores() {
        for (String chore : chores) {
            System.out.println(chore);
        }
    }

    // Method updating an item
    public void updateChores(String oldChore, String newChore) {
        for (int i= 0; i < chores.size(); i++) {
            if (chores.get(i).equals(oldChore)) {
                chores.set(i, newChore);
                return;
            }
        }
    }

    // Method to remove items
    public void removeChores(String chore) {
        chores.remove(chore);
    }


}
