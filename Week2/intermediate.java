/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author PRIX
 */
public class intermediate {
    public static void main(String[] args) {
        
        double average = 85;
        int absences = 2;

        boolean passed = ((average >= 75 && absences <= 3) || average >= 90);

        System.out.println("Average: " + average);
        System.out.println("Absences: " + absences);

        if (passed) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
    
}
