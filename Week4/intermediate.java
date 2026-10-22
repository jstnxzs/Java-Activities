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
public class intermediate {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();

            if (number != -1) {
                total += number;
            }
        }

        System.out.println("Final total: " + total);

        input.close();
    }
    
}
