/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author PRIX
 */

public class advanced {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {

            if (i == 3) {
                continue;
            }

            for (int j = 1; j <= i; j++) {

                // break = stop the loop when the j reaches 4
                if (j == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}
