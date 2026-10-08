/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author PRIX
 */
public class advanced {
    public static void main(String[] args) {
        
       

        double balance = 1000;

        balance += 500;
        System.out.println("Step 1: " + balance);

        balance *= 2;
        System.out.println("Step 2: " + balance);

        balance += 200;
        System.out.println("Step 3: " + balance);

        int count = 5;

        System.out.println("count++: " + count++);
     
        count = 5;

        System.out.println("++count: " + ++count);
        
        // count++ uses the old value first, then increases it.
        // ++count increases the value first, then uses the new value.
    }
}
