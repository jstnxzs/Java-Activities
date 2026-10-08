/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author PRIX
 */
public class expert {
    public static void main(String[] args) {
        
        byte num = 127;
        num++;
        System.out.println("Byte Overflow: " + num);

        
        String a = new String("Justine");
        String b = new String("Justine");
        String c = "Justine";

        System.out.println("a == b: " + (a == b));
        System.out.println("a.equals(b): " + a.equals(b));

        // a and b are different objects, so == is false.
        // .equals() compares their text, so it is true.

        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        // a is a new object, while c uses a String literal, so == is false.
        // .equals() compares the text, so it is true.

        System.out.println("b == c: " + (b == c));
        System.out.println("b.equals(c): " + b.equals(c));

        // b is also a new object, while c is a literal, so == is false.
        // .equals() compares the text, so it is true.

        int[] first = {10, 20, 30};
        int[] second = first;

        second[0] = 100;

        System.out.println("First array value: " + first[0]);
        System.out.println("Second array value: " + second[0]);
    }
    
}
