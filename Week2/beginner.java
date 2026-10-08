/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author PRIX
 */
public class beginner {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 3;

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
        
        // Division and % can behave differently with negative numbers
        // because Java keeps the sign of the first number.
    }
    
}
