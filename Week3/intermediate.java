/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author PRIX
 */
public class intermediate {
    public static void main(String[] args) {
        
       double purchaseamount = 2499;
       double discount;
       double finalprice;
       
       if (purchaseamount < 1000){
           discount = 0;
       } else if (purchaseamount < 2500){
           discount = 5;
       } else if (purchaseamount < 4000){
           discount = 10;
       } else {
           discount = 15;
       }
       
       finalprice = purchaseamount - (purchaseamount * discount / 100);
       
        System.out.println("Purchase Amount: " + purchaseamount);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + finalprice);
    }
    
}
