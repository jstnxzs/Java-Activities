/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

/**
 *
 * @author PRIX
 */
public class expert {
    
    public static void main(String[] args) {
        String username = "justine123";
        int pin = 1234;
        double balance = 25000.00;
        double withdrawal = 5000.00;

        String tier = "";
        double dailylimit = 0;
        double feerate = 0;
        double fee;
        double total;

        if (username.equals("justine123")) {
            if (pin == 1234) {
                System.out.println("Login successful!");

               
                if (balance < 5000) {
                    tier = "Bronze";
                    dailylimit = 2000;
                } else if (balance < 15000) {
                    tier = "Silver";
                    dailylimit = 5000;
                } else if (balance < 50000) {
                    tier = "Gold";
                    dailylimit = 10000;
                } else {
                    tier = "Platinum";
                    dailylimit = 20000;
                }

                System.out.println("Account Tier: " + tier);

               
                switch (tier) {
                    case "Bronze":
                        feerate = 0.02;
                        break;
                    case "Silver":
                        feerate = 0.015;
                        break;
                    case "Gold":
                        feerate = 0.01;
                        break;
                    case "Platinum":
                        feerate = 0.005;
                        break;
                }

                fee = withdrawal * feerate;
                total = withdrawal + fee;

               
                if (withdrawal > 0) {
                    if (withdrawal <= balance) {
                        if (withdrawal <= dailylimit) {
                            if (total <= balance) {
                                System.out.println("TRANSACTION APPROVED");
                                System.out.println("Withdrawal: " + withdrawal);
                                System.out.println("Fee: " + fee);
                                System.out.println("Total Deducted: " + total);
                                System.out.println("Remaining Balance: "
                                        + (balance - total));
                            } else {
                                System.out.println("DENIED: Insufficient balance for withdrawal and fee.");
                            }
                        } else {
                            System.out.println("DENIED: Daily withdrawal limit exceeded.");
                        }
                    } else {
                        System.out.println("DENIED: Insufficient balance.");
                    }
                } else {
                    System.out.println("DENIED: Withdrawal must be greater than zero.");
                }

            } else {
                System.out.println("ACCESS DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("ACCESS DENIED: Incorrect username.");
        }
    }
    
}
