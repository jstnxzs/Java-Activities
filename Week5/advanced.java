/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

/**
 *
 * @author PRIX
 */
import java.util.Arrays;
public class advanced {
    
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};
        int target = 92;
        int index = -1;

        // Linear search
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Score found at index: " + index);
        } else {
            System.out.println("Score not found.");
        }

        // Sort a copy to preserve the original array and its indexes.
        int[] sortedscores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedscores);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedscores));
    }
    
}
