/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author PRIX
 */
public class expert {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;

        // PREDICTED: true
        System.out.println(a + 5 == b && b > a);

        // PREDICTED: true
        System.out.println(a++ < b && a == 6);

        // PREDICTED: true
        System.out.println((b - a) * 2 >= 8 || a == 6);
    }
}
