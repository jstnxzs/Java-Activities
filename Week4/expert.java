/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author PRIX
 */

import java.util.Scanner;

public class expert {

static Scanner input = new Scanner(System.in);

    static int[][] warehouse = {
        {10, 5, -1},
        {2, 15, 8},
        {0, 12, 4}
    };

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== INVENTORY SYSTEM ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find Critical Shelf");
            System.out.println("4. Restock Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                displayInventory();
            } else if (choice == 2) {
                totalInventory();
            } else if (choice == 3) {
                findCriticalShelf();
            } else if (choice == 4) {
                restockShelf();
            } else if (choice == 5) {
                System.out.println("Exiting inventory system...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        input.close();
    }

    
    static void displayInventory() {
        System.out.println("\nWarehouse Inventory:");

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    System.out.print("[DAMAGED] ");
                } else {
                    System.out.print(warehouse[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

   
    static void totalInventory() {
        int total = 0;

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                if (warehouse[i][j] == -1) {
                    continue; 
                }

                total += warehouse[i][j];
            }
        }

        System.out.println("Total inventory: " + total + " items");
    }

  
    static void findCriticalShelf() {
        boolean found = false;

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                if (warehouse[i][j] == -1) {
                    continue; 
                }

                if (warehouse[i][j] <= 2) {
                    System.out.println(
                        "Critical shelf found at row " + (i + 1)
                        + ", column " + (j + 1)
                        + " with " + warehouse[i][j] + " items."
                    );

                    found = true;
                    break; 
                }
            }

            if (found) {
                break; 
            }
        }

        if (!found) {
            System.out.println("No critically low shelf found.");
        }
    }

   
    static void restockShelf() {
        System.out.print("Enter row (1-" + warehouse.length + "): ");
        int row = input.nextInt();

        System.out.print("Enter column (1-" + warehouse[0].length + "): ");
        int col = input.nextInt();

        
        if (row < 1 || row > warehouse.length ||
            col < 1 || col > warehouse[0].length) {
            System.out.println("Invalid shelf position.");
            return; 
        }

        
        if (warehouse[row - 1][col - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return; 
        }

        int amount;

        while (true) {
            System.out.print("Enter quantity to add (greater than 0): ");
            amount = input.nextInt();

            if (amount > 0) {
                break; 
            }

            System.out.println("Invalid quantity. Please try again.");
        }

        warehouse[row - 1][col - 1] += amount;

        System.out.println("Restocking successful!");
        System.out.println("Updated shelf quantity: "
            + warehouse[row - 1][col - 1]);
    }    
}
