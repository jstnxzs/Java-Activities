/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author PRIX
 */
public class advanced {
    
    public static void main(String[] args) {
        
        double centimeters = 175.5;

        int meters = (int) centimeters / 100;
        double remainingcentimeters = centimeters - (meters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + meters);
        System.out.println("Remaining Centimeters: " + remainingcentimeters);

        // Implicit widening: int can automatically become double without a cast.
        int number = 10;
        double widenednumber = number;

        System.out.println("Implicit Widening: " + widenednumber);

        // Explicit narrowing: casting double to int removes the decimal part (.75).
        double decimalnumber = 25.75;
        int narrowednumber = (int) decimalnumber;

        System.out.println("Explicit Narrowing: " + narrowednumber);
    }
    
}
